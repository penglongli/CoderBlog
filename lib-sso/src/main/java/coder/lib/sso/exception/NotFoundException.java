package coder.lib.sso.exception;

/**
 * @feature 请求资源不存在
 * @httpMethod *
 *
 * @author Pelin
 * @createdAt 2017-01-29
 */
public class NotFoundException extends BaseException{
    public NotFoundException() {
        super(404);
    }

    public NotFoundException(String message) {
        super(404, message);
    }
}
