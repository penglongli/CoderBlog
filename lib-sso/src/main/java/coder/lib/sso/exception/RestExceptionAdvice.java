package coder.lib.sso.exception;

import coder.lib.core.assem.Result;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @feature REST 接口全局异常处理器
 * @httpMethod *
 *
 * @author Pelin
 * @createdAt 2017-01-28
 */
public class RestExceptionAdvice {

    // 400
    @ExceptionHandler(BadRequestException.class)
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    @ResponseBody
    public Result handleBadRequestException(BadRequestException e) {
        return Result.failed(e.getCode(), e.getMessage());
    }

    // 401
    @ExceptionHandler(UnauthorizedException.class)
    @ResponseStatus(value = HttpStatus.UNAUTHORIZED)
    @ResponseBody
    public Result handleNotFoundException(UnauthorizedException e) {
        return Result.failed(e.getCode(), e.getMessage());
    }

    // 403
    @ExceptionHandler(ForbiddenException.class)
    @ResponseStatus(value = HttpStatus.FORBIDDEN)
    @ResponseBody
    public Result handleForbiddenException(ForbiddenException e) {
        return Result.failed(e.getCode(), e.getMessage());
    }

    // 404
    @ExceptionHandler(NotFoundException.class)
    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    @ResponseBody
    public Result handleNotFoundException(NotFoundException e) {
        return Result.failed(e.getCode(), e.getMessage());
    }

    // 410
    @ExceptionHandler(GoneException.class)
    @ResponseStatus(value = HttpStatus.GONE)
    @ResponseBody
    public Result handleGoneException(GoneException e) {
        return Result.failed(e.getCode(), e.getMessage());
    }
}
