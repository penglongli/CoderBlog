package coder.blog.personal.app.category;

import coder.blog.personal.app.BaseForm;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Size;

/**
 * Created by Pelin on 17/1/27.
 */
public class CategoryForm extends BaseForm {

    @NotBlank(message = "")
    @Size(min = 1, max = 10)
    private String name;
}
