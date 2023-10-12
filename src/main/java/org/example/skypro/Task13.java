package org.example.skypro;

import java.util.*;

/*
1. На вход получаем список названий книг
2. Распределяем книги по полкам так, чтобы на каждой полке было примерно одинаковое количество книг
3. Все книги должны быть отсортированы по алфавиту с первой до последней полки
4. Количество полок константное - 5 штук
5. Вернуть книги распределенные по полкам
*/
public class Task13 {
    private static final int SHELVES_AMOUNT = 5;

    public static void main(String[] args) {
        ArrayList<String> books = new ArrayList<>();

        books.add("1984");
        books.add("To Kill a Mockingbird");
        books.add("The Great Gatsby");
        books.add("Pride and Prejudice");
        books.add("The Catcher in the Rye");
        books.add("Moby-Dick");
        books.add("The Lord of the Rings");
        books.add("The Chronicles of Narnia");
        books.add("Harry Potter and the Sorcerer's Stone");
        books.add("The Hunger Games");
        books.add("The Da Vinci Code");
        books.add("The Alchemist");
        books.add("The Kite Runner");
        books.add("The Hobbit");
        books.add("Brave New World");

        System.out.println(distributeBooks(books));
    }

    public static Map<Integer, List<String>> distributeBooks(List<String> bookTitles) {
        int numBooks = bookTitles.size();
        int booksPerShelf = numBooks / SHELVES_AMOUNT;
        int reminders = numBooks % SHELVES_AMOUNT;
        Collections.sort(bookTitles);

        Map<Integer, List<String>> bookCase = new HashMap<>();

        int startInx = 0;
        for (int i = 0; i < SHELVES_AMOUNT; i++) {
            int shelfSize = booksPerShelf + (i < reminders ? 1 : 0);
            List<String> shelf = bookTitles.subList(startInx, startInx + shelfSize);
            bookCase.put(i + 1, shelf);
            startInx += shelfSize;
        }
        return bookCase;
    }

}
