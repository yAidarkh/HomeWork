package StreamData;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("src/StreamData/recources/test.txt");
        String[] lines = {
                "Java", "Go", "Php", "Assembler", "Fortran", "Rust"
        };
        for (int i = 0; i < lines.length; i++) {
            int temp = i + 1;
            fileWriter.write(temp +". "+ lines[i] + "\n");
        }
        fileWriter.close();
    }
}
