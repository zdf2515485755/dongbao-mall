package com.zdf.msbdongbaoportalweb.advices;

import com.zdf.msbdongbaocommonbase.result.ResponseResult;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 * 参数校验，统一输出异常
 */
@RestControllerAdvice
public class ValidateHandler extends ResponseEntityExceptionHandler
{
    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
                                                                  HttpHeaders headers,
                                                                  HttpStatus status,
                                                                  WebRequest request) {
        StringBuilder sb = new StringBuilder();
        for (FieldError fieldError: ex.getBindingResult().getFieldErrors()){
            String defaultMessage = fieldError.getDefaultMessage();
            sb.append("   "+defaultMessage);

            break;
        }

        return new ResponseEntity(new ResponseResult<>().setCode(100).setMessage(sb.toString()),
                HttpStatus.OK);
    }


}
