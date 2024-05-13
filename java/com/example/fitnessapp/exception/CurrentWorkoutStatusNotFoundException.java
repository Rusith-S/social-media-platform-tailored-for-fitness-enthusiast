package com.example.fitnessapp.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class CurrentWorkoutStatusNotFoundException extends RuntimeException{

    public CurrentWorkoutStatusNotFoundException(String message) {
        super(message);
    }
}
