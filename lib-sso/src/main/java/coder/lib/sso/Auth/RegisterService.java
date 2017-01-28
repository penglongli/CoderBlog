package coder.lib.sso.auth;

import coder.lib.core.bean.User;
import coder.lib.sso.form.auth.RegisterForm;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.servlet.http.HttpServletRequest;

import static coder.account.db.account.AccountConst.*;

/**
 * Created by Pelin on 16/12/26.
 */
@Service
public class RegisterService {
    //ExceptionHandler
    //ResponseEntityExceptionHandler
    public User registerV1(HttpServletRequest request, RegisterForm form) throws Exception {
        String sessionId = (String) request.getAttribute("user_session");

        String type = form.getType();
        switch (type) {
            case TYPE_EMAIL: {

                break;
            }
            case TYPE_PHONE: {
                break;
            }
            default: {
                throw new Exception("");
            }
        }

        return null;
    }
}
