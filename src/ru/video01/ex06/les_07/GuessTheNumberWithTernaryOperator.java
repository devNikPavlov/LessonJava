package ru.video01.ex06.les_07;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberWithTernaryOperator {
    public static void main(String[] args) {

        var number = new Random().nextInt(10);
        var userCase = new Scanner(System.in).nextInt();

        String result = number == userCase ?
                "Вы угадали данное число!" :
                "Попробуйте вести другое число";

        System.out.println(result);
    }
}
