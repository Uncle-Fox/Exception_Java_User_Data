package org.example.exceptions;

public class IncorrectNameFormatException extends Throwable {
    public IncorrectNameFormatException() {
        super("you entered an incorrect expression for your full name");
    }
}

