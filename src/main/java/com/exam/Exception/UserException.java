package com.exam.Exception;

/**
 * Created by Tman on 2017/4/2.
 */
public class UserException extends RuntimeException {
    public UserException() {
    }

    public UserException(String message) {
        super(message);
    }

    public UserException(String message, Throwable cause) {
        super(message, cause);
    }
}
