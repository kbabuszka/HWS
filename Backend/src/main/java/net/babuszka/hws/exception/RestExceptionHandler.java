package net.babuszka.hws.exception;

import net.babuszka.hws.exception.exceptions.AuthorizationException;
import net.babuszka.hws.exception.exceptions.EntityNotFoundException;
import net.babuszka.hws.exception.exceptions.NoPermissionsException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {

    private ResponseEntity<Object> buildResponseEntity(HttpStatus status, Exception exception) {
        ApiError apiError = new ApiError(status, exception);
        return new ResponseEntity<>(apiError, apiError.getStatus());
    }

    @ExceptionHandler(value = EntityNotFoundException.class)
    protected ResponseEntity<Object> handleEntityNotFound(EntityNotFoundException ex) {
        return buildResponseEntity(HttpStatus.NOT_FOUND, ex);
    }

    @ExceptionHandler(value = NoPermissionsException.class)
    protected ResponseEntity<Object> handleNoPermissions(NoPermissionsException ex) {
        return buildResponseEntity(HttpStatus.FORBIDDEN, ex);
    }

    @ExceptionHandler(value = AuthorizationException.class)
    protected ResponseEntity<Object> handleNoAuthorization(AuthorizationException ex) {
        return buildResponseEntity(HttpStatus.UNAUTHORIZED, ex);
    }

}
