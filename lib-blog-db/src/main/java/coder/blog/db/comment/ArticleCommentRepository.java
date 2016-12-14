package coder.blog.db.comment;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by Pelin on 16/12/14.
 */
public interface ArticleCommentRepository extends CrudRepository<ArticleComment, Integer> {

}
