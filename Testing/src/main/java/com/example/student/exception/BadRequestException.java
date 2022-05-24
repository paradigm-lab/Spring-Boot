package com.example.student.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

public class BadRequestException extends Throwable {

    public BadRequestException(String student) {

    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public class badRequestException extends RuntimeException{
        public badRequestException(String msg) {
            super(msg);
        }
    }

}
