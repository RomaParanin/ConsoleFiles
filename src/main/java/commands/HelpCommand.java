package main.java.commands;

public class HelpCommand {
    public static void getHelp() {
        System.out.println("help - список доступных комманд; \n" +
                "createFile path_to_file - создать файл в указанной директории; \n" +
                "writeFile (-a)  path_to_content - добавить в файл; \n" +
                "cp (-a) source_file dest_file - копировать файл; \n" +
                "deleteFile path_to_file - удалить файл; \n" +
                "zip path_to_zip_file files - заархивировать файл;\n" +
                "cat path_to_file - показать содержимое файла;\n" +
                "shutdown - выход\n");
    }
}
