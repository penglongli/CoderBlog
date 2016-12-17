package coder.blog.db.category;

import coder.blog.db.BaseEntity;
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
@Table(name = "`blog_categories`")
public class ArticleCategory extends BaseEntity{

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "name")
    private String name;

    @Column(name = "sequence")
    private Integer sequence;

    @Column(name = "hidden")
    private Boolean hidden;
}
