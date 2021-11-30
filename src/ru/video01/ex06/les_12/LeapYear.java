// Проверка високосного года

package ru.video01.ex06.les_12;

public class LeapYear {
    public static void main(String[] args) {

        var year = 2019;

        boolean isLeap;
        if (year % 400 == 0) {
            isLeap = true;
        } else if (year % 100 == 0) {
            isLeap = false;
        } else if (year % 4 == 0) {
            isLeap = true;
        } else {
            isLeap = false;
        }

        System.out.println(isLeap ? year + " Високосный год" : year + " не високосный год");
    }
}
