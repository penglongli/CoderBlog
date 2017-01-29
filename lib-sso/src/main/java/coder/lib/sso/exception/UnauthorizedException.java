package coder.lib.sso.exception;

/**
 * @feature 未得到授权
 * @httpMethod *
 *
 * @author Pelin
 * @createdAt 2017-01-29
 */
public class UnauthorizedException extends BaseException{
    public UnauthorizedException() {
        super(401);
    }

    public UnauthorizedException(String message) {
        super(401, message);
    }
}
