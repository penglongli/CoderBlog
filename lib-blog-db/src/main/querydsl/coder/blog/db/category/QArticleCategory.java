package coder.blog.db.category;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QArticleCategory is a Querydsl query type for ArticleCategory
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QArticleCategory extends EntityPathBase<ArticleCategory> {

    private static final long serialVersionUID = -798355759L;

    public static final QArticleCategory articleCategory = new QArticleCategory("articleCategory");

    public final coder.blog.db.QBaseEntity _super = new coder.blog.db.QBaseEntity(this);

    //inherited
    public final DateTimePath<java.sql.Timestamp> createdAt = _super.createdAt;

    //inherited
    public final DateTimePath<java.sql.Timestamp> deletedAt = _super.deletedAt;

    //inherited
    public final NumberPath<Integer> id = _super.id;

    public final StringPath name = createString("name");

    public final NumberPath<Integer> sequence = createNumber("sequence", Integer.class);

    //inherited
    public final DateTimePath<java.sql.Timestamp> updatedAt = _super.updatedAt;

    public final NumberPath<Integer> userId = createNumber("userId", Integer.class);

    public QArticleCategory(String variable) {
        super(ArticleCategory.class, forVariable(variable));
    }

    public QArticleCategory(Path<? extends ArticleCategory> path) {
        super(path.getType(), path.getMetadata());
    }

    public QArticleCategory(PathMetadata<?> metadata) {
        super(ArticleCategory.class, metadata);
    }

}

