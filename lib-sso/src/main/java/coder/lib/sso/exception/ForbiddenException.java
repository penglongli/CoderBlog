package coder.lib.sso.exception;

/**
 * @feature 用户得到授权, 但访问被禁止
 * @httpMethod *
 *
 * @author Pelin
 * @createdAt 2017-01-29
 */
public class ForbiddenException extends BaseException{
    public ForbiddenException() {
        super(403);
    }

    public ForbiddenException(String message) {
        super(403, message);
    }
}
