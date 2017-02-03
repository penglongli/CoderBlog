package coder.lib.sso.app.auth;

import coder.account.db.account.Account;
import coder.account.db.key.GlobalKey;
import coder.account.db.key.GlobalKeyRepository;
import coder.lib.core.bean.User;
import coder.lib.sso.app.account.AccountService;
import coder.lib.sso.app.key.GlobalKeyService;
import coder.lib.sso.exception.BadRequestException;
import org.apache.commons.lang3.StringUtils;
import org.apache.tomcat.jni.Global;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpServletRequest;

import java.sql.Timestamp;

import static coder.account.db.account.AccountConst.*;
import static org.apache.commons.lang3.StringUtils.defaultIfEmpty;

/**
 * Created by Pelin on 16/12/26.
 */
@Service
public class RegisterService {

    @Autowired
    private GlobalKeyRepository globalKeyRepository;

    @Autowired
    private GlobalKeyService globalKeyService;

    @Autowired
    private AccountService accountService;

    @Transactional
    public User registerV1(HttpServletRequest request, RegisterForm form) throws BadRequestException {
        String sessionId = (String) request.getAttribute("user_session");

        GlobalKey globalKey = new GlobalKey(form.getGlobalKey());
        globalKeyService.save(globalKey);

        String type = form.getType();
        switch (type) {
            case TYPE_EMAIL: {
                return emailRegister(form, globalKey);
            }
            case TYPE_PHONE: {
                return phoneRegister(form, globalKey);
            }
            default: {
                throw new BadRequestException("register.type.not.valid");
            }
        }
    }

    private User emailRegister(RegisterForm form, GlobalKey globalKey) {
        Integer gkId = globalKey.getId();
        Account account = buildAccount(form, gkId);

        String key = globalKey.getName();
        account = accountService.save(account, key);

        return accountService.transAccountToUser(account);
    }

    private User phoneRegister(RegisterForm form, GlobalKey globalKey) {
        Integer gkId = globalKey.getId();
        Account account = buildAccount(form, gkId);

        String key = globalKey.getName();
        account = accountService.save(account, key);

        return accountService.transAccountToUser(account);
    }

    private Account buildAccount(RegisterForm form, Integer gkId) {
        Account account = new Account();

        account.setGlobalKeyId(gkId);
        switch (form.getType()) {
            case TYPE_EMAIL: {
                account.setEmail(form.getEmail());
                account.setPhone("");
                break;
            }
            case TYPE_PHONE: {
                account.setEmail("");
                account.setPhone(form.getPhone());
                break;
            }
            default: {
                throw new BadRequestException("register.type.not.valid");
            }
        }
        account.setPassword(form.getPassword());
        return account;
    }
}
