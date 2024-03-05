package org.example.exceptions;

public class IncorrectGenderFormatException extends Throwable {
    public IncorrectGenderFormatException() {
        super("Gender format error: bad symbol");
    }
}
