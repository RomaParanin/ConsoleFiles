package main.java.commands;

import java.io.*;

public class CopyFileCommand {
    public static void copyFile(Boolean append, String sourceFilePath, String newFilePath) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(sourceFilePath));
            String temp;
            CreateFileCommand.createFile(newFilePath);
            while ((temp = reader.readLine()) != null){
                WriteFileCommand.writeFile(append, newFilePath, temp);
            }
            System.out.println("файл скопирован");
        } catch (IOException e) {
            e.getMessage();
        }
    }
}