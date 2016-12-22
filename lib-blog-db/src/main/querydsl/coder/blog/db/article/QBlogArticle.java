package coder.blog.db.article;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QBlogArticle is a Querydsl query type for BlogArticle
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QBlogArticle extends EntityPathBase<BlogArticle> {

    private static final long serialVersionUID = 1589631471L;

    public static final QBlogArticle blogArticle = new QBlogArticle("blogArticle");

    public final coder.blog.db.QBaseEntity _super = new coder.blog.db.QBaseEntity(this);

    public final NumberPath<Integer> articleClass = createNumber("articleClass", Integer.class);

    public final NumberPath<Integer> categoryId = createNumber("categoryId", Integer.class);

    public final StringPath content = createString("content");

    //inherited
    public final DateTimePath<java.sql.Timestamp> createdAt = _super.createdAt;

    //inherited
    public final DateTimePath<java.sql.Timestamp> deletedAt = _super.deletedAt;

    public final StringPath description = createString("description");

    public final BooleanPath hidden = createBoolean("hidden");

    public final StringPath htmlContent = createString("htmlContent");

    //inherited
    public final NumberPath<Integer> id = _super.id;

    public final StringPath originalAddress = createString("originalAddress");

    public final NumberPath<Long> readNum = createNumber("readNum", Long.class);

    public final NumberPath<Integer> thumbNum = createNumber("thumbNum", Integer.class);

    public final StringPath title = createString("title");

    public final NumberPath<Short> type = createNumber("type", Short.class);

    //inherited
    public final DateTimePath<java.sql.Timestamp> updatedAt = _super.updatedAt;

    public final NumberPath<Integer> userId = createNumber("userId", Integer.class);

    public QBlogArticle(String variable) {
        super(BlogArticle.class, forVariable(variable));
    }

    public QBlogArticle(Path<? extends BlogArticle> path) {
        super(path.getType(), path.getMetadata());
    }

    public QBlogArticle(PathMetadata<?> metadata) {
        super(BlogArticle.class, metadata);
    }

}

