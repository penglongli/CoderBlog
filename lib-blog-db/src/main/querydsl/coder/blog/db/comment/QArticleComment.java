package coder.blog.db.comment;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QArticleComment is a Querydsl query type for ArticleComment
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QArticleComment extends EntityPathBase<ArticleComment> {

    private static final long serialVersionUID = 1681806117L;

    public static final QArticleComment articleComment = new QArticleComment("articleComment");

    public final coder.blog.db.QBaseEntity _super = new coder.blog.db.QBaseEntity(this);

    public final StringPath content = createString("content");

    //inherited
    public final DateTimePath<java.sql.Timestamp> createdAt = _super.createdAt;

    //inherited
    public final DateTimePath<java.sql.Timestamp> deletedAt = _super.deletedAt;

    public final StringPath deviceType = createString("deviceType");

    public final NumberPath<Integer> floor = createNumber("floor", Integer.class);

    public final StringPath htmlContent = createString("htmlContent");

    //inherited
    public final NumberPath<Integer> id = _super.id;

    public final NumberPath<Integer> thumbNum = createNumber("thumbNum", Integer.class);

    //inherited
    public final DateTimePath<java.sql.Timestamp> updatedAt = _super.updatedAt;

    public final NumberPath<Integer> userId = createNumber("userId", Integer.class);

    public QArticleComment(String variable) {
        super(ArticleComment.class, forVariable(variable));
    }

    public QArticleComment(Path<? extends ArticleComment> path) {
        super(path.getType(), path.getMetadata());
    }

    public QArticleComment(PathMetadata<?> metadata) {
        super(ArticleComment.class, metadata);
    }

}

