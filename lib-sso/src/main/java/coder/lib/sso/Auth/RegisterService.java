package coder.lib.sso.auth;

import coder.lib.core.bean.User;
import coder.lib.sso.form.auth.RegisterForm;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Pelin on 16/12/26.
 */
@Service
public class RegisterService {

    public User registerV1(HttpServletRequest request, RegisterForm form) {
        String sessionId = (String) request.getAttribute("user_session");


        return null;
    }
}
