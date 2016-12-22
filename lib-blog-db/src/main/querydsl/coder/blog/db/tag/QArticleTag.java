package coder.blog.db.tag;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QArticleTag is a Querydsl query type for ArticleTag
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QArticleTag extends EntityPathBase<ArticleTag> {

    private static final long serialVersionUID = -852561467L;

    public static final QArticleTag articleTag = new QArticleTag("articleTag");

    public final coder.blog.db.QBaseEntity _super = new coder.blog.db.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.sql.Timestamp> createdAt = _super.createdAt;

    //inherited
    public final DateTimePath<java.sql.Timestamp> deletedAt = _super.deletedAt;

    //inherited
    public final NumberPath<Integer> id = _super.id;

    public final StringPath name = createString("name");

    //inherited
    public final DateTimePath<java.sql.Timestamp> updatedAt = _super.updatedAt;

    public QArticleTag(String variable) {
        super(ArticleTag.class, forVariable(variable));
    }

    public QArticleTag(Path<? extends ArticleTag> path) {
        super(path.getType(), path.getMetadata());
    }

    public QArticleTag(PathMetadata<?> metadata) {
        super(ArticleTag.class, metadata);
    }

}

