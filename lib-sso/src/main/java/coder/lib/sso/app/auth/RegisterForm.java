package coder.lib.sso.app.auth;

import coder.lib.sso.app.BaseForm;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.validation.Errors;

import javax.validation.constraints.Size;

/**
 * Created by Pelin on 16/12/26.
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class RegisterForm extends BaseForm {

    // 用户名, 不允许特殊符号
    @NotBlank(message = "")
    @Size(min = 1, max = 30)
    private String globalKey;

    private String email;

    private String phone;

    // 必须同时包含小写字母以及数字
    @NotBlank(message = "")
    @Size(min = 7, max = 72)
    private String password;

    @NotBlank(message = "")
    @Size(min = 7, max = 72)
    private String repeatPassword;

    @NotBlank(message = "")
    private String type;

    @Override
    public void validate(Object target, Errors errors) {
        if (globalKey.contains(".")) {
            rejectValue(errors, "globalKey", "");
        }
    }

}
