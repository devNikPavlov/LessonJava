package ru.video01.ex07.les_13;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {

        var number = new Random().nextInt(10);

        while (true) {
            var userCase = new Scanner(System.in).nextInt();

            if (number > userCase) {
                System.out.println("Число > " + userCase + ". Пожайлуста? попробуйте еще.");
            } else if (number < userCase) {
                System.out.println("Число < " + userCase + ". Пожайлуста? попробуйте еще.");
            } else {
                System.out.println("Поздравляем. Вы угадали данное число.");
                 break;
            }
        }
    }
}
