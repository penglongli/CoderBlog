package coder.blog.personal.app.article;

import lombok.Getter;

/**
 * Created by Pelin on 16/12/15.
 */
public class ArticleConsts {
    private final static Short TYPE_ORIGINAL = 1;
    private final static Short TYPE_REPRINTED = 2;
    private final static Short TYPE_TRANSLATION = 3;

    public enum ArticleType {
        ORIGINAL(TYPE_ORIGINAL, "TYPE_ORIGINAL"),
        REPRINTED(TYPE_REPRINTED, "TYPE_REPRINTED"),
        TRANSLATION(TYPE_TRANSLATION, "TYPE_TRANSLATION");

        @Getter
        private short code;
        @Getter
        private String msg;

        ArticleType(Short code, String msg) {
            this.code = code;
            this.msg = msg;
        }
    }
}
