package coder.blog.db.configure;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QBlogConfigure is a Querydsl query type for BlogConfigure
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QBlogConfigure extends EntityPathBase<BlogConfigure> {

    private static final long serialVersionUID = 806551247L;

    public static final QBlogConfigure blogConfigure = new QBlogConfigure("blogConfigure");

    public QBlogConfigure(String variable) {
        super(BlogConfigure.class, forVariable(variable));
    }

    public QBlogConfigure(Path<? extends BlogConfigure> path) {
        super(path.getType(), path.getMetadata());
    }

    public QBlogConfigure(PathMetadata<?> metadata) {
        super(BlogConfigure.class, metadata);
    }

}

