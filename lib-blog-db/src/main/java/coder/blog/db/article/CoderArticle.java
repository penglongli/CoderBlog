package coder.blog.db.article;

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
@Table(name = "`coder_articles`")
public class CoderArticle extends BaseEntity{

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "title")
    private String title;

    @Column(name = "content")
    private String content;

    @Column(name = "html_content")
    private String htmlContent;

    @Column(name = "tag_id")
    private String tagId;

    @Column(name = "description")
    private String description;

    @Column(name = "type")
    private Integer type;

    @Column(name = "category_id")
    private String categoryId;

    @Column(name = "article_class")
    private Integer articleClass;

    @Column(name = "thumb_num")
    private Integer thumbNum;

    @Column(name = "read_num")
    private Integer readNum;
}
