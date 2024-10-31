package com.ks.ksfinal.exception;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ks.ksfinal.common.ApplicationConstant;
import com.ks.ksfinal.model.ResponseModel;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(Exception.class)
    @ResponseBody 
    public ResponseEntity<ResponseModel> handleException(Exception e) {
		return new ResponseEntity<ResponseModel>(
				new ResponseModel(HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST,
						ApplicationConstant.GENERAL_ERROR, new ArrayList<Object>(), new ArrayList<String>(Arrays.asList(e.getMessage()))),
				HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(NoHandlerFoundException.class)
    public ResponseEntity<String> handleNoHandlerFound(NoHandlerFoundException ex) {
        return new ResponseEntity<>("Resource not found", HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(HttpRequestMethodNotSupportedException.class)
    public ResponseEntity<String> handleMethodNotSupported(HttpRequestMethodNotSupportedException ex) {
        return new ResponseEntity<>("Method not allowed", HttpStatus.METHOD_NOT_ALLOWED);
    }
}