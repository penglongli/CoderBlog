package coder.blog.db.comment;

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
@Table(name = "`article_comments`")
public class ArticleComment extends BaseEntity{

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "content")
    private String content;

    @Column(name = "html_content")
    private String htmlContent;

    @Column(name = "thumb_num")
    private Integer thumbNum;

    @Column(name = "floor")
    private Integer floor;

    @Column(name = "device_type")
    private String deviceType;
}
