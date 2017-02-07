package coder.lib.core.session;

import coder.lib.core.bean.User;
import lombok.Data;

import java.sql.Timestamp;

/**
 * @Author: Pelin on 17/2/5.
 * @Email: penglong95.li@gmail.com
 */
@Data
public class UserSession {

    private User user;

    private Boolean rememberMe;

    private Timestamp lastActiveAt;

    private Timestamp lastLoginAt;
}
