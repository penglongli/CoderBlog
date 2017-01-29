package coder.lib.sso.exception;

/**
 * @feature 请求错误, 参数校验出错
 * @httpMethod POST/PUT/PATCH
 *
 * @author Pelin
 * @createdAt 2017-01-28
 */
public class BadRequestException extends BaseException{
    public BadRequestException() {
        super(400);
    }

    public BadRequestException(String message) {
        super(400, message);
    }
}
