package coder.blog.db.thumb;

import coder.blog.db.BaseEntity;

import javax.persistence.Column;

/**
 * Created by Pelin on 16/12/14.
 */
public class Thumb extends BaseEntity {

    @Column(name = "user_id")
    private Integer userId;

    // 类型: 文章、评论
    @Column(name = "type")
    private Short type;

    // 实体(文章、评论) ID
    @Column(name = "entity_id")
    private Integer entityId;

    // 投票类型
    @Column(name = "vote_type")
    private Short voteType;
}
