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
@Table(name = "`blog_articles`")
public class BlogArticle extends BaseEntity{

    @Column(name = "slug")
    private String slug;

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "category_id")
    private Integer categoryId;

    @Column(name = "title")
    private String title;

    @Column(name = "content")
    private String content;

    @Column(name = "html_content")
    private String htmlContent;

    @Column(name = "description")
    private String description;

    // 原创、转载、翻译
    @Column(name = "type")
    private Short type;

    // 原始地址: 为保证版权, 转载、翻译的文章需注明原文链接
    @Column(name = "original_address")
    private String originalAddress;

    // 首页分类
    @Column(name = "article_class")
    private Integer articleClass;

    @Column(name = "thumb_num")
    private Integer thumbNum;

    @Column(name = "read_num")
    private Long readNum;

    @Column(name = "hidden")
    private Boolean hidden;
}
