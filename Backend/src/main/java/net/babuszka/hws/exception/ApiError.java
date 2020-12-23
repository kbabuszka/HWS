package net.babuszka.hws.exception;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Getter
@Setter
public class ApiError {

    private HttpStatus status;
    private LocalDateTime timestamp;
    private String message;
    private String detailedMessage;

    public ApiError() {
        this.timestamp = LocalDateTime.now();
    }

    public ApiError(HttpStatus status, Throwable ex) {
        this();
        this.status = status;
        this.message = "Unexpected error";
        this.detailedMessage = ex.getLocalizedMessage();
    }

    public ApiError(HttpStatus status, Throwable ex, String message) {
        this();
        this.status = status;
        this.message = message;
        this.detailedMessage = ex.getLocalizedMessage();
    }

}
