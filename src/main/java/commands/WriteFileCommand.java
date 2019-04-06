package main.java.commands;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class WriteFileCommand {
    public static void writeFile(Boolean append, String filePath, String content) {
        if (!Files.exists(Paths.get(filePath))) {
            System.out.println("файл с таким именем не существует");
        }
        else {
            try {
                FileWriter writer = new FileWriter(filePath, append);
                writer.write(content);
                writer.flush();
                System.out.println("запись была внесена");
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
