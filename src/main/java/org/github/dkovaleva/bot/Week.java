package org.github.dkovaleva.bot;

public enum Week {
    Monday("Понедельник"),
    Tuesday("Вторник"),
    Wednesday("Среда"),
    Thursday("Четверг"),
    Friday("Пятница"),
    Saturday("Суббота"),
    Sunday("Воскресенье");

    private String day;

    Week(String day) {
        this.day = day;
    }


}
