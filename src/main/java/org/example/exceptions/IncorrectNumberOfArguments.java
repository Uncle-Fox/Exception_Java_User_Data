package org.example.exceptions;

public class IncorrectNumberOfArguments extends Throwable {
    public IncorrectNumberOfArguments(int argsCount) {
        super(argsCount > 6 ? "You entered more arguments" : "You input more 6 args");
    }
}