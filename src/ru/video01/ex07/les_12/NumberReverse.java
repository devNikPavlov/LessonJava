// Реверс числа

package ru.video01.ex07.les_12;

public class NumberReverse {
    public static void main(String[] args) {

        // исходные данные
        var number = 123456789;

        // обработка
        var result = 0;
        var temp = number;
        while (temp != 0) {
            var digit = temp % 10;
            result = result * 10 + digit;
            temp /= 10;
        }

        // отбражение результата на экран
        System.out.println("реверс чисел: " + result);
    }
}
