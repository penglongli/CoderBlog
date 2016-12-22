package coder.blog.db.draft;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QArticleDraft is a Querydsl query type for ArticleDraft
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QArticleDraft extends EntityPathBase<ArticleDraft> {

    private static final long serialVersionUID = 1156437797L;

    public static final QArticleDraft articleDraft = new QArticleDraft("articleDraft");

    public final NumberPath<Integer> userId = createNumber("userId", Integer.class);

    public QArticleDraft(String variable) {
        super(ArticleDraft.class, forVariable(variable));
    }

    public QArticleDraft(Path<? extends ArticleDraft> path) {
        super(path.getType(), path.getMetadata());
    }

    public QArticleDraft(PathMetadata<?> metadata) {
        super(ArticleDraft.class, metadata);
    }

}

