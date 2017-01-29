package coder.lib.sso.exception;

/**
 * @feature 资源被删除或者已隐藏
 * @httpMethod GET
 *
 * @author Pelin
 * @createdAt 2017-01-29
 */
public class GoneException extends BaseException{
    public GoneException() {
        super(410);
    }

    public GoneException(String message) {
        super(410, message);
    }
}
