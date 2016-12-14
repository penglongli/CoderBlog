package coder.blog.db.tag;

import coder.blog.db.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Pelin on 16/12/15.
 */
// 文章与标签关系 Bean
@Data
@Entity
@EqualsAndHashCode(callSuper = false)
@Table(name = "`article_with_tags`")
public class ArticleWithTag extends BaseEntity{

    @Column(name = "article_id")
    private Integer articleId;

    @Column(name = "tag_id")
    private Integer tagId;
}
