package main.java.commands;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipFileCommand {

    public static void zipFile(String zipFilePath, String[] filePaths) {
        try {
            FileOutputStream fos = new FileOutputStream(zipFilePath);
            ZipOutputStream zos = new ZipOutputStream(fos);
            for (int i = 0; i < filePaths.length; i++) {
                File file = new File(filePaths[i]);
                FileInputStream fis = new FileInputStream(file);
                ZipEntry entry = new ZipEntry(filePaths[i]);
                zos.putNextEntry(entry);
                byte[] bytes = new byte[1024];
                int length;
                while ((length = fis.read(bytes)) >= 0) {
                    zos.write(bytes, 0, length);
                }
                fis.close();
            }
            zos.closeEntry();
            zos.close();
            System.out.println("файлы заархивированы");
        } catch (IOException e) {
            e.getMessage();
        }
    }
}