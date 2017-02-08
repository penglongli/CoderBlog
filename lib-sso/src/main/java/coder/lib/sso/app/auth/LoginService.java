package coder.lib.sso.app.auth;

import coder.lib.sso.app.bean.User;
import coder.lib.sso.app.session.UserSession;
import org.springframework.stereotype.Service;

/**
 * Created by Pelin on 16/12/26.
 */
@Service
public class LoginService {

    public void updateLoginSession(User user, String sessionId, Boolean rememberMe) {
        UserSession userSession = new UserSession();

        userSession.setUser(user);
        userSession.setRememberMe(rememberMe);
        store.set(sid, session);
    }
}
