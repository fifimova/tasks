package org.example;

public class RandomException extends Exception{
    public RandomException() {
    }

    public RandomException(String message) {
        super(message);
    }

    public RandomException(String message, Throwable cause) {
        super(message, cause);
    }

    public RandomException(Throwable cause) {
        super(cause);
    }
}
