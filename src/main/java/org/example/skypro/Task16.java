package org.example.skypro;

import java.io.*;

/*
Создать метод, создающий копию файла по пути к нему
*/
public class Task16 {
    public static void main(String[] args) {
       String sourcePath = "F:/text.txt";
       String targetPath = "F:/text1.txt";
        try {
            copyFile(sourcePath, targetPath);
            System.out.println("файл скопирован");
        } catch (IOException e) {
            System.out.println("файла нет");
        }
    }

    static void copyFile(String sourcePath, String targetPath) throws IOException {
        File sourceFile = new File(sourcePath);
        File targetFile = new File(targetPath);


        try (InputStream in = new FileInputStream(sourceFile);
             OutputStream op = new FileOutputStream(targetFile)) {
            byte[] buffer = new byte[1024];
            int length;
            while ((length = in.read(buffer)) > 0) {
                op.write(buffer, 0, length);
            }
        }
    }
}
