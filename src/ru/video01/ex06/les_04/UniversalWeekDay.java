package ru.video01.ex06.les_04;

public class UniversalWeekDay {
    public static void main(String[] args) {

        var day = 1;
        var isMondayFirst = true;

        var internalDay = day;
        if (!isMondayFirst) {
            internalDay--;
            if (internalDay == 0) {
                internalDay = 7;
            }
        }

        String result;
        if (internalDay == 1) {
            result = "Понедельник";
        } else if (internalDay == 2) {
            result = "Вторник";
        } else if (internalDay == 3) {
            result = "Среда";
        } else if (internalDay == 4) {
            result = "Четверг";
        } else if (internalDay == 5) {
            result = "Пятница";
        } else if (internalDay == 6) {
            result = "Суббота";
        } else if (internalDay == 7) {
            result = "Воскресенье";
        } else {
            result = "Выбрано не правельное число";
        }

        System.out.println(result);
    }
}
