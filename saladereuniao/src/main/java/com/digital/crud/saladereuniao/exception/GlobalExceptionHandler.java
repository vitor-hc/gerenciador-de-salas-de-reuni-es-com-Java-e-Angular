package com.digital.crud.saladereuniao.exception;

import java.util.Date;

import jdk.jshell.spi.ExecutionControl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler {

   @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<?>resourceNotFoundException(ResourceNotFoundException ex, WebRequest request){
       boolean b;
       ErroDatails erroDatails=new ErroDatails(new Date(), ex.getMessage(), request.getDescription( b = false));
       return new ResponseEntity<>(erroDatails, HttpStatus.NOT_FOUND);
   }
   @ExceptionHandler(Exception.class)

   public ResponseEntity<?>globalExceptionHandler(Exception ex, WebRequest request){
       boolean b;
       ErroDatails erroDatails=new ErroDatails(new Date(), ex.getMessage(), request.getDescription( b = false));
       return  new ResponseEntity<>(erroDatails, HttpStatus.INTERNAL_SERVER_ERROR);
   }
}
