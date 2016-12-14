package coder.blog.db.tag;

import coder.blog.db.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Pelin on 16/12/14.
 */
@Data
@Entity
@EqualsAndHashCode(callSuper = false)
@Table(name = "`article_tags`")
public class ArticleTag extends BaseEntity{

    @Column(name = "name")
    private String name;
}
