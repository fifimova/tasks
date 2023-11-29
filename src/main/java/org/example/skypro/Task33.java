package org.example.skypro;

/* Напишите Java-программу для удаления всех пробелов из строки с помощью replace(). */
public class Task33 {

    public static void main(String[] args) {
        String source = "     asd 44 f f             ll    ";

        String trimmed = source.replace(" ", "");
        System.out.println(trimmed);

        String trimmed2 = source.replaceAll("\\s+", " ").trim();
        System.out.println(trimmed2);
    }
}
