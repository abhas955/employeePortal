package tech.getarrays.employeeportal.src.main.tech.getarrays.exception;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(String message) {
        super(message);
    }
}
