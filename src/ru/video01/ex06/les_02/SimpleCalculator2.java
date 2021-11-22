package ru.video01.ex06.les_02;

import java.util.Scanner;

public class SimpleCalculator2 {
    public static void main(String[] args) {

        System.out.println("Введите число A: ");
        var a = new Scanner(System.in).nextInt();
        System.out.println("Введите число B: ");
        var b = new Scanner(System.in).nextInt();
        System.out.println("Введиет оператор: {+, -, *, /, %}");
        var operator = new Scanner(System.in).nextLine().charAt(0);

        String result = null;
        if (operator == '+') {
            result = "a + b = " + (a + b);
        } else if (operator == '-') {
            result = "a - b = " + (a - b);
        } else if (operator == '*') {
            result = "a * b = " + (a * b);
        } else if (operator == '/') {
            result = "a / b = " + (a / b);
        } else if (operator == '%') {
            result = "a % b = " + (a % b);
        } else {
            result = "ВВеден не правельный оператор" + operator;
        }

        System.out.println(result);
    }
}
