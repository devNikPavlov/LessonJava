package ru.video01.ex06.les_03;

import java.util.Scanner;

public class WeekDay {
    public static void main(String[] args) {

        System.out.println("Введите число от 1 - до 7. Число соответствует дню недели.");
        var day = new Scanner(System.in).nextInt();

        if (day == 1) {
            System.out.println("Понедельник");
        } else if (day == 2) {
            System.out.println("Вторник");
        } else if (day == 3) {
            System.out.println("Среда");
        } else if (day == 4) {
            System.out.println("Четверг");
        } else if (day == 5) {
            System.out.println("Пятница");
        } else if (day == 6) {
            System.out.println("Суббота");
        } else if (day == 7) {
            System.out.println("Воскресенье");
        } else {
            System.out.println("Вы введи не правельное число");
        }
    }
}
