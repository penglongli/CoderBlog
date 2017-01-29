package coder.lib.sso.app;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

/**
 * Created by Pelin on 16/12/26.
 */
public class BaseForm implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return this.getClass().equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {}

    public Boolean validate(Errors errors) {
        validate(this, errors);

        return !errors.hasErrors();
    }

    protected void rejectValue(Errors errors, String field, String key) {
        errors.rejectValue(field, field, key);
    }
}
