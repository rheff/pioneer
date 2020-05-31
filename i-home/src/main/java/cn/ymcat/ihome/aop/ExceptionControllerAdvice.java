package cn.ymcat.ihome.aop;

import cn.ymcat.ihome.common.enums.ResultCode;
import cn.ymcat.ihome.exception.APIException;
import cn.ymcat.ihome.response.ResultVO;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author 86152
 */
@RestControllerAdvice
public class ExceptionControllerAdvice {

    @ExceptionHandler(APIException.class)
    public ResultVO<String> APIExceptionHandler(APIException e) {
        // 注意哦，这里传递的响应码枚举
        return new ResultVO<>(ResultCode.FAILED, e.getMsg());
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResultVO<String> MethodArgumentNotValidExceptionHandler(MethodArgumentNotValidException e) {
        ObjectError objectError = e.getBindingResult().getAllErrors().get(0);
        // 注意哦，这里传递的响应码枚举
        return new ResultVO<>(ResultCode.VALIDATE_FAILED, objectError.getDefaultMessage());
    }
}
