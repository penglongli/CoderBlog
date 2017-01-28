package coder.blog.personal.app.article;

import coder.blog.personal.app.BaseForm;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.validation.Errors;

import javax.validation.constraints.Size;

/**
 * Created by Pelin on 17/1/27.
 */
public class ArticleForm extends BaseForm{

    @NotEmpty(message = "")
    private Integer categoryId;

    @NotBlank(message = "")
    @Size(min = 1, max = 64)
    private String title;

    @NotBlank(message = "")
    private String content;

    @NotBlank(message = "")
    private String description;

    @NotBlank(message = "")
    private String type;

    @NotEmpty(message = "")
    private Integer articleClass;

    private String originalAddress;

    @Override
    public void validate(Object target, Errors errors) {
//        if (userName.contains(".")) {
//            rejectValue(errors, "globalKey", "");
//        }
    }
}
