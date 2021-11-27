package ru.video01.ex06.les_05;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {

        var number = new Random().nextInt(10);
        var userCase = new Scanner(System.in).nextInt();

        String result;
        if (number == userCase) {
            result = "Вы угадали данное число!";
        }else {
            result = "Попробуйте вести другое число";
        }

        System.out.println(result);
    }
}
