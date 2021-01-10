package error;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//This type of exception must be handled at compile time or it will not pass compilation
public class CheckedException {
    public static void main(String[] args) {
        FileReader fileReader = null;

        try {
            fileReader = new FileReader("error/exception.txt");
            char c = (char) fileReader.read();
            System.out.println(c);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (fileReader!=null)
                    fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
