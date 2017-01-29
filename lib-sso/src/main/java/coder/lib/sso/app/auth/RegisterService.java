package coder.lib.sso.app.auth;

import coder.account.db.key.GlobalKey;
import coder.account.db.key.GlobalKeyRepository;
import coder.lib.core.bean.User;
import coder.lib.sso.app.key.GlobalKeyService;
import coder.lib.sso.exception.BadRequestException;
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

    @Transactional
    public User registerV1(HttpServletRequest request, RegisterForm form) throws BadRequestException {
        String sessionId = (String) request.getAttribute("user_session");

        GlobalKey globalKey = new GlobalKey(form.getGlobalKey());
        globalKeyService.save(globalKey);

        String type = form.getType();
        switch (type) {
            case TYPE_EMAIL: {
                return emailRegister();
            }
            case TYPE_PHONE: {
                return phoneRegister();
            }
            default: {
                throw new BadRequestException("register.type.not.valid");
            }
        }
    }

    private User emailRegister() {

        return null;
    }

    private User phoneRegister() {

        return null;
    }
}
