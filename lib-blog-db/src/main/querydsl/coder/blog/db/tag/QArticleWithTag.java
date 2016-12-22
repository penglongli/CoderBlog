package coder.blog.db.tag;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QArticleWithTag is a Querydsl query type for ArticleWithTag
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QArticleWithTag extends EntityPathBase<ArticleWithTag> {

    private static final long serialVersionUID = -2107130465L;

    public static final QArticleWithTag articleWithTag = new QArticleWithTag("articleWithTag");

    public final coder.blog.db.QBaseEntity _super = new coder.blog.db.QBaseEntity(this);

    public final NumberPath<Integer> articleId = createNumber("articleId", Integer.class);

    //inherited
    public final DateTimePath<java.sql.Timestamp> createdAt = _super.createdAt;

    //inherited
    public final DateTimePath<java.sql.Timestamp> deletedAt = _super.deletedAt;

    //inherited
    public final NumberPath<Integer> id = _super.id;

    public final NumberPath<Integer> tagId = createNumber("tagId", Integer.class);

    //inherited
    public final DateTimePath<java.sql.Timestamp> updatedAt = _super.updatedAt;

    public QArticleWithTag(String variable) {
        super(ArticleWithTag.class, forVariable(variable));
    }

    public QArticleWithTag(Path<? extends ArticleWithTag> path) {
        super(path.getType(), path.getMetadata());
    }

    public QArticleWithTag(PathMetadata<?> metadata) {
        super(ArticleWithTag.class, metadata);
    }

}

