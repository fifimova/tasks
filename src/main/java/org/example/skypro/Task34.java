package org.example.skypro;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/* Напишите Java-программу для удаления всех пробелов из строки без использования replace(). */
public class Task34 {

    public static void main(String[] args) {
        String source = "     asd 44 f f             ll    ";

        //сначала переводим в массив чаров
        char[] chars = source.toCharArray();
        System.out.println(Arrays.toString(chars));

        //но т.к. с примитивами не работают дальнейшие преобразования в лист,
        //то кастуем его в массив оберток
        Character[] charsWrapper = new Character[chars.length];
        for (int i = 0; i < chars.length; i++) {
            charsWrapper[i] = chars[i];
        }
        System.out.println(Arrays.toString(charsWrapper));

        // через Arrays.asList переводим в лист и стримом фильтруем
        List<Character> listChars = Arrays.asList(charsWrapper).stream()
                .filter(character -> character != ' ')
                .collect(Collectors.toList());
        System.out.println(listChars);

        //то же самое, но перевод в лист через List.of, просто вльтернатива
        List<Character> listChars2 = List.of(charsWrapper).stream()
                .filter(character -> character != ' ')
                .collect(Collectors.toList());
        System.out.println(listChars2);
    }
}
