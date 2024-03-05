package org.example.exceptions;

public class IncorrectDateFormatException extends Throwable {
    public IncorrectDateFormatException() {
        super("Wrong date format: does not match the pattern \"dd.MM.yyyy\" ");
    }
}