package main.java.commands;

import java.io.File;

public class DeleteFileCommand {
    public static void deleteFile(String filePath) {
        File file = new File(filePath);
        if (!file.exists()) {
            System.out.println("такого файла не существует");
        }
        else {
            if (file.delete()) {
                System.out.println("файл удален");
            }
            else System.out.println("произошла ошибка при удалении файла");

        }
    }
}
