package com.practice.spring.exception;

import org.springframework.beans.ConversionNotSupportedException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MissingPathVariableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.NoHandlerFoundException;
import lombok.extern.slf4j.Slf4j;

@ControllerAdvice
@Slf4j
public class CommonExceptionAdvice {

    @ExceptionHandler(NoHandlerFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String except(NoHandlerFoundException exception) {
        log.error("Exception ==> {}", exception.getMessage());
        return "/error/404";
    }

    @ExceptionHandler(MissingPathVariableException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public String except(MissingPathVariableException exception) {
        log.error("Exception ==> {}", exception.getMessage());
        return "/error/500";
    }

    @ExceptionHandler(ConversionNotSupportedException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public String except(ConversionNotSupportedException exception) {
        log.error("Exception ==> {}", exception.getMessage());
        return "/error/" + exception.getErrorCode();
    }

}