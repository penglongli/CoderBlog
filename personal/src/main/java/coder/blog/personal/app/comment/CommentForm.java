package coder.blog.personal.app.comment;

import org.hibernate.validator.constraints.NotBlank;

/**
 * Created by Pelin on 17/1/27.
 */
public class CommentForm {

    @NotBlank(message = "")
    private String content;
}
