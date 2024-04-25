package FilesWork.HomeWork;

import java.io.File;


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
                    checkInside(file1);
                }
            }
        }else {
            System.out.println(file);
        }
    }
}
