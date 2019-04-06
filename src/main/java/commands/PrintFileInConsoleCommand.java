package main.java.commands;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class PrintFileInConsoleCommand {
    public static void printFileInConsole(String filePath) {
        StringBuilder builder = new StringBuilder();
        if (Files.exists(Paths.get(filePath))){
            try{
                FileReader reader = new FileReader(filePath);
                int i;
                while ((i = reader.read()) != -1) {
                    builder.append((char)i);
                }
                reader.close();
            } catch (IOException e) {
                e.getMessage();
            }
            if (builder.length() == 0) {
                System.out.println("файл " + filePath +  " пуст.");
            }
            else {
                System.out.println("содержимое файла " + filePath);
                System.out.println(builder);
            }
        }
        else System.out.println("файл не найден");
    }
}
