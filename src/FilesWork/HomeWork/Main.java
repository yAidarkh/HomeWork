package FilesWork.HomeWork;

import java.io.File;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        File file = new File("src");
        checkInside(file);
    }

    static void checkInside(File file) {
        if (file.isDirectory()){
            File[] files = file.listFiles();
            if (file != null){
                for (File file1 : files) {
                    if (file.isDirectory()){
                        checkInside(file1);
                    }else {
                        System.out.println(file1);
                    }
                }
            }
        }else {
            System.out.println(file);
        }
    }
}
