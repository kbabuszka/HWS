package net.babuszka.hws.exception.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.FORBIDDEN)
public class NoPermissionsException extends RuntimeException{

    private final static String DEFAULT_MESSAGE = "You have no permissions to access this resource";

    public NoPermissionsException() {
        super(DEFAULT_MESSAGE);
    }

    public NoPermissionsException(String message) {
        super(message);
    }
}
