package ru.video01.ex06.les_01;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {

        var a = new Scanner(System.in).nextInt();
        var b = new Scanner(System.in).nextInt();

        if (a > b) {
            var result1 = "a > b";
            System.out.println(result1);
        } else {
            System.out.println("a <= b");
        }

        // Вложеность
        if (a > b) {
            System.out.println("a > b");
        } else {
            if (a < b) {
                System.out.println("a < b");
            } else {
                System.out.println("a = b");
            }
        }

        // Упрощенная конструкция, чем вложенность (выше)
        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }
    }
}
