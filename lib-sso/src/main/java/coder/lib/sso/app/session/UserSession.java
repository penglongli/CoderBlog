package coder.lib.sso.app.session;

import coder.lib.sso.app.bean.User;
import lombok.Data;

import java.sql.Timestamp;

/*
 * Created by Pelin on 17/2/5.
 */
@Data
public class UserSession {

    private User user;

    private Boolean rememberMe;

    private Timestamp lastActiveAt;

    private Timestamp lastLoginAt;
}
