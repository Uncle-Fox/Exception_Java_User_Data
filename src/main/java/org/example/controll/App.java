package org.example.controll;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import org.example.exceptions.IncorrectDateFormatException;
import org.example.exceptions.IncorrectGenderFormatException;
import org.example.exceptions.IncorrectNameFormatException;
import org.example.exceptions.IncorrectNumberOfArguments;
import org.example.exceptions.IncorrectPhoneNumberFormatException;

public class App {
    public App() {
    }

    public static void run() {
        String data = Prompt.prompt() + "\n";
        String currentDirectory = System.getProperty("user.dir");
        String path = currentDirectory + File.separator;

        try {
            if (Validator.validate(data)) {
                path = path + File.separator + data.split("\\s")[0];
                File file = new File(path);
                FileWriter writer = new FileWriter(file, true);

                try {
                    writer.write(data);
                } catch (Throwable var8) {
                    try {
                        writer.close();
                    } catch (Throwable var7) {
                        var8.addSuppressed(var7);
                    }

                    throw var8;
                }

                writer.close();
            }
        } catch (IncorrectNumberOfArguments | IOException | IncorrectDateFormatException | IncorrectPhoneNumberFormatException | IncorrectGenderFormatException | IncorrectNameFormatException var9) {
            var9.printStackTrace();
        }

    }
}
