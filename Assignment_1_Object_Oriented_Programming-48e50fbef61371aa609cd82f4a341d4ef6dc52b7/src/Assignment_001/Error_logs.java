package Assignment_001;

import java.io.*;

/*
    This class acts like a storage room for error messages that may occur while running the program
 */
public class Error_logs {
    public void errorCollect(String note){
        try {
            File log = new File("errors.log");
            if (!log.exists()) {
                log.createNewFile();
            }
            PrintWriter error_archive = new PrintWriter(new BufferedWriter(new FileWriter(log, true)));
            error_archive.write(note);
            error_archive.println();
            error_archive.close();

        } catch (IOException e) {
            System.out.println("This error log cannot be saved because of code issues or" +
                    " because it does not exist");
            throw new RuntimeException(e);

        }
    }
}
