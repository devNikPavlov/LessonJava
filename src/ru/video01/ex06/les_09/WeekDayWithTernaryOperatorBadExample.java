package ru.video01.ex06.les_09;

public class WeekDayWithTernaryOperatorBadExample {
    public static void main(String[] args) {

        var day = 5;
        System.out.println(
                day == 1 ? "Понедельник" :
                        day == 2 ? "Вторник" :
                                day == 3 ? "Среда" :
                                        day == 4 ? "Четверг" :
                                                day == 5 ? "Пятница" :
                                                        day == 6 ? "Суббота" :
                                                                day == 7 ? "Воскресенье" :
                                                                        "Не правельно указаное число"  + day);
    }
}
