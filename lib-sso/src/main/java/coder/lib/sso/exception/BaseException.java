package coder.lib.sso.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Created by Pelin on 17/1/28.
 */
@Data
@EqualsAndHashCode(callSuper = false)
class BaseException extends RuntimeException{
    private int code;

    BaseException(int code) {
        this.code = code;
    }

    BaseException(int code, String msg) {
        super(msg);
        this.code = code;
    }
}
