package main.java.commands;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CreateFileCommand {
    public static void createFile(String filePath){
        if (Files.exists(Paths.get(filePath))){
            System.out.println("файл уже создан");
        }
        else {
            File file = new File(filePath);
            try {
                if (file.createNewFile()) {
                    System.out.println("файл был успешно создан");
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
