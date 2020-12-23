package net.babuszka.hws.exception.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.UNAUTHORIZED)
public class AuthorizationException extends RuntimeException{

    private final static String DEFAULT_MESSAGE = "You are not authorized";

    public AuthorizationException() {
        super(DEFAULT_MESSAGE);
    }

    public AuthorizationException(String message) {
        super(message);
    }
}
