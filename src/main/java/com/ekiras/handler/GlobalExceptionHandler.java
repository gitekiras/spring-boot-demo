package com.ekiras.handler;

import com.ekiras.exception.BaseException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ekansh
 * @since 20/1/16
 */
@ControllerAdvice
@RestController
public class GlobalExceptionHandler {


    @ResponseStatus(HttpStatus.OK)
    @ExceptionHandler(value = BaseException.class)
    public String handleBaseException(BaseException e){
        return e.getMessage();
    }

    @ExceptionHandler(value = Exception.class)
    public String handleException(Exception e){return e.getMessage();}


}
