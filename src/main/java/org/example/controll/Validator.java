package org.example.controll;


import org.example.exceptions.IncorrectDateFormatException;
import org.example.exceptions.IncorrectGenderFormatException;
import org.example.exceptions.IncorrectNameFormatException;
import org.example.exceptions.IncorrectNumberOfArguments;
import org.example.exceptions.IncorrectPhoneNumberFormatException;

public class Validator {
    public Validator() {
    }

    public static boolean validate(String expression) throws IncorrectNumberOfArguments, IncorrectNameFormatException, IncorrectDateFormatException, IncorrectPhoneNumberFormatException, IncorrectGenderFormatException {
        String[] tokens = expression.trim().split("\\s+");
        if (tokens.length != 6) {
            throw new IncorrectNumberOfArguments(tokens.length);
        } else {
            int i = 0;

            while(i < tokens.length) {
                if (tokens[0].matches("[A-Za-z]+") && tokens[1].matches("[A-Za-z]+") && tokens[2].matches("[A-Za-z]+")) {
                    if (!tokens[3].matches("(0[1-9]|[12][0-9]|3[01])\\.(0[1-9]|1[12])\\.(19[0-9][0-9]|20[0-2][0-4])")) {
                        throw new IncorrectDateFormatException();
                    }

                    if (tokens[4].length() == 11 && tokens[4].matches("[0-9]+")) {
                        if (!tokens[5].matches("[mf]")) {
                            throw new IncorrectGenderFormatException();
                        }

                        ++i;
                        continue;
                    }

                    throw new IncorrectPhoneNumberFormatException(tokens[4]);
                }

                throw new IncorrectNameFormatException();
            }

            return true;
        }
    }
}
