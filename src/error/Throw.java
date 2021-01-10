package error;

import java.io.FileReader;
import java.io.IOException;

public class Throw {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("error/exception.txt");;
        char c = (char) fileReader.read();
        System.out.println(c);
        fileReader.close();
    }
}
