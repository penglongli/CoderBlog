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
    @NotBlank(message = "register.global.key.not.null")
    @Size(min = 1, max = 30)
    private String name;

    @NotBlank(message = "register.email.not.null")
    private String email;

    @NotBlank(message = "register.validate.code.not.null")
    @Size(min = 6, max = 6)
    private String validateCode;

    // 必须同时包含小写字母以及数字, 不允许出现"小(大)写字母 + 数字"以外的字符
    @NotBlank(message = "register.password.not.null")
    @Size(min = 7, max = 72)
    private String password;

    @NotBlank(message = "register.repeat.password.not.null")
    @Size(min = 7, max = 72)
    private String repeatPassword;

    @NotBlank(message = "register.type.not.null")
    private String type;

    @Override
    public void validate(Object target, Errors errors) {
        if (!password.equals(repeatPassword)) {
            rejectValue(errors, "repeatPassword", "register.repeat.password.not.equaled");
        }
    }

}
