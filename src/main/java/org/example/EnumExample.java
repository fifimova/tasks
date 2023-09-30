package org.example;

public enum EnumExample {
    MONDAY("Monday", "Понедельник"),
    TUESDAY("Tuesday", "Вторник"),
    WEDNESDAY("Wednesday", "Среда"),
    THURSDAY("Thursday", "Четверг"),
    FRIDAY("Friday", "Пятница"),
    SATURDAY("Saturday", "Суббота"),
    SUNDAY("Sunday", "Воскресенье");

    private final String englishName;
    private final String russianName;

    EnumExample(String englishName, String russianName) {
        this.englishName = englishName;
        this.russianName = russianName;
    }

    public String getEnglishName() {
        return englishName;
    }

    public String getRussianName() {
        return russianName;
    }
}


