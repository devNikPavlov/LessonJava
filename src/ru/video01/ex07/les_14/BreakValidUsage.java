package ru.video01.ex07.les_14;

import java.util.Random;
import java.util.Scanner;

public class BreakValidUsage {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
            if (i == 5) {
                break;
            }
        }
        System.out.println();

        // Тут возможен не корректное применение break, если нам нужно подсчет до 5, то можно записать и так
        for (int i =0; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Корректное использование break
        // 1 - когда бесконечный цикл
        // 2 - имеется ограниченное число попыток
        var number = new Random().nextInt(10);

        var quessed = false;
        for (int i = 0; i < 10; i++){
            var userCase = new Scanner(System.in).nextInt();

            if (number > userCase) {
                System.out.println("Число > " + userCase + ". Пожайлуста? попробуйте еще.");
            } else if (number < userCase) {
                System.out.println("Число < " + userCase + ". Пожайлуста? попробуйте еще.");
            } else {
                boolean b = quessed != true;
                System.out.println("Поздравляем. Вы угадали данное число.");
                break;
            }
        }

        if (!quessed) {
            System.out.println("Вы исчерпали свои попытки");
        }
    }
}
