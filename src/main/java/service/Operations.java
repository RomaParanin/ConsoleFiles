package main.java.service;

import main.java.commands.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Operations {
    public static Operations getInstance() {
        return new Operations();
    }

    public void action(){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean process = true;
        try{
            while (process) {
                System.out.println("***** Введите команду *****");
                String[] input = reader.readLine().split("\\s+");
                if (Commands.HELP.equalsIgnoreCase(input[0])) {
                    HelpCommand.getHelp();
                }
                if (Commands.CREATE_FILE.equalsIgnoreCase(input[0])) {
                    CreateFileCommand.createFile(input[1]);
                }
                if (Commands.WRITE_FILE.equalsIgnoreCase(input[0])) {
                    if (input[1].equalsIgnoreCase("-a")) {
                        WriteFileCommand.writeFile(true, input[2], input[3]);
                    } else {
                        WriteFileCommand.writeFile(false, input[1], input[2]);
                    }
                }
                if (Commands.COPY_FILE.equalsIgnoreCase(input[0])) {
                    if (input[1].equalsIgnoreCase("-a")) {
                        CopyFileCommand.copyFile(true, input[2], input[3]);
                    }
                    else {
                        CopyFileCommand.copyFile(false, input[1], input[2]);
                    }
                }
                if (Commands.DELETE_FILE.equalsIgnoreCase(input[0])) {
                    DeleteFileCommand.deleteFile(input[1]);
                }
                if (Commands.ZIP.equalsIgnoreCase(input[0])) {
                    String[] files = new String[input.length - 2];
                    for (int i = 2; i < input.length; i++) {
                        files[i - 2] = input[i];
                    }
                    ZipFileCommand.zipFile(input[1], files);
                }
                if (Commands.CAT.equalsIgnoreCase(input[0])) {
                    PrintFileInConsoleCommand.printFileInConsole(input[1]);
                }
                if (Commands.SHUTDOWN.equalsIgnoreCase(input[0])) {
                    process = false;
                }
            }
        } catch (IOException e){
            e.printStackTrace();
        } catch (NullPointerException e) {
            e.getMessage();
        }

    }
}
