package com.betbull.assignment.config;

import com.betbull.assignment.model.BetException;
import com.betbull.assignment.model.MyResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.servlet.http.HttpServletRequest;

/**
 * @author atanriverdi
 */
@Slf4j
@RestControllerAdvice
public class ServiceExceptionHandler extends ResponseEntityExceptionHandler {

    /**
     * @param req
     * @param ex
     * @return
     */
    @ExceptionHandler(Throwable.class)
    @ResponseBody
    private ResponseEntity<MyResponse> handleControllerException(HttpServletRequest req, Throwable ex) {


        if (ex instanceof BetException) {
            log.error(((BetException) ex).getCode(), ex);
            MyResponse myResponse = new MyResponse(((BetException) ex).getCode(), ex.getMessage());

            return new ResponseEntity<>(myResponse, HttpStatus.INTERNAL_SERVER_ERROR);
        } else {
            log.error("Beklenmeyen bir hat oldu!", ex);
            MyResponse myResponse = new MyResponse("500", ex.getMessage());

            return new ResponseEntity<>(myResponse, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    /**
     * @param ex
     * @param headers
     * @param status
     * @param request
     * @return
     */
    @Override
    protected ResponseEntity<Object> handleNoHandlerFoundException(NoHandlerFoundException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
        MyResponse myResponse = new MyResponse("500", ex.getMessage());

        return new ResponseEntity<>(myResponse, HttpStatus.NOT_FOUND);
    }

}
