package javacore.videodim.project01.section05.les_02;

//TODO Простейший калькулятор

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {

        //   1
        System.out.println("Введите первое число:");
        int a = new Scanner(System.in).nextInt();
        System.out.println("Введите второе число:");
        int b = new Scanner(System.in).nextInt();

        //   2
        var aPlusB = a + b;
        var aMinusB = a - b;
        var aMulB = a * b;
        var aDivB = a / b;
        var aModB = a % b;

        //   3
        System.out.println("a + b = " + aPlusB);
        System.out.println("a - b = " + aMinusB);
        System.out.println("a * b = " + aMulB);
        System.out.println("a / b = " + aDivB);
        System.out.println("a % b = " + aModB);
    }
}
