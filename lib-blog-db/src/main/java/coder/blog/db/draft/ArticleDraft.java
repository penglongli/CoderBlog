package coder.blog.db.draft;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Pelin on 16/12/11.
 */
@Data
@Entity
@EqualsAndHashCode(callSuper = false)
@Table(name = "`blog_drafts`")
public class ArticleDraft {

    @Column(name = "user_id")
    private Integer userId;


}
