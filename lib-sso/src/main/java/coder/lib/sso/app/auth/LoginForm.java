package coder.lib.sso.app.auth;

import coder.lib.sso.app.BaseForm;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Size;

/**
 * Created by Pelin on 16/12/26.
 */
public class LoginForm extends BaseForm {

    // 用户名或者邮箱
    @NotBlank(message = "")
    @Size(min = 1)
    private String userName;

    @NotBlank(message = "")
    @Size(min = 7)
    private String password;
}
