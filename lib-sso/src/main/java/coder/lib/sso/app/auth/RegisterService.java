package coder.lib.sso.app.auth;

import coder.account.db.account.Account;
import coder.account.db.account.AccountConst;
import coder.account.db.key.GlobalKey;
import coder.account.db.key.GlobalKeyRepository;
import coder.lib.sso.app.bean.User;
import coder.lib.sso.app.account.AccountService;
import coder.lib.sso.app.key.GlobalKeyService;
import coder.lib.sso.exception.BadRequestException;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpServletRequest;

import static coder.account.db.account.AccountConst.*;

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

        return register(form, sessionId);
    }

    private User register(RegisterForm form, String sessionId) {
        Account account = buildAccount(form);
        account = accountService.save(account);

        return accountService.transAccountToUser(account);
    }

    private Account buildAccount(RegisterForm form) {
        Account account = new Account();

        account.setEmail(form.getEmail());
        account.setStatus(AccountConst.STATUS_NORMAL);
        account.setPassword(form.getPassword());
        return account;
    }
}
