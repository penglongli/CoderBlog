package coder.lib.sso.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Created by Pelin on 17/1/28.
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class BaseException extends RuntimeException{
    private int status;

    protected BaseException(int status) {
        this.status = status;
    }

    protected BaseException(int status, String msg) {
        super(msg);
        this.status = status;
    }
}
