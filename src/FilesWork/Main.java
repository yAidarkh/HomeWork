package FilesWork;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("src/FilesWork/resources");
        Path path2 = path.resolve("reports-main");
        Path path3 = path.resolve("logs");
        String[] files = {"info.txt", "debug.txt", "warn.txt"};
        if (!Files.exists(path)) {
            Files.createDirectory(path);
            System.out.println("Создана директория: " + path.getFileName());
        }
        if (!Files.exists(path2)) {
            Files.createDirectory(path2);
            System.out.println("Создана директория: " + path2.getFileName());
        }
        if (!Files.exists(path3)) {
            Files.createDirectory(path3);
            System.out.println("Создана директория: " + path3.getFileName());
        }

        for (int i = 1; i < 4; i++) {
            Path filePath = path2.resolve("main-report" + i + ".txt");
            if (!Files.exists(filePath)) {
                Files.createFile(filePath);
                System.out.println("Создан файл: " + filePath.getFileName());
            }
        }
        for (String file : files) {
            Path filePath = path3.resolve(file);
            if (!Files.exists(filePath)) {
                Files.createFile(filePath);
                System.out.println("Создан файл: " + filePath.getFileName());
            }
        }
    }
}
