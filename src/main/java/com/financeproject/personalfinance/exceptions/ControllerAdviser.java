package com.financeproject.personalfinance.exceptions;

import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.client.HttpClientErrorException;

@ControllerAdvice
public class ControllerAdviser {

    @ExceptionHandler(NotFoundException.class)
    public @ResponseBody
    ResponseEntity<Error> notFoundException(NotFoundException exception){
        return new ResponseEntity<>(new Error(exception.getMessage()), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler({BadRequestException.class, IllegalArgumentException.class})
    public @ResponseBody ResponseEntity<Error> handleBadRequestException(BadRequestException exception){
        return new ResponseEntity<>(new Error(exception.getMessage()), HttpStatus.BAD_REQUEST);
    }



}
