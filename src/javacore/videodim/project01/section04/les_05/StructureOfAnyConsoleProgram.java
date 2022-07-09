package javacore.videodim.project01.section04.les_05;

//TODO Структура любой консольной программы

import java.util.Scanner;

public class StructureOfAnyConsoleProgram {
    public static void main(String[] args) {

        // чтение исходных данных - read source data
        System.out.println("Пожалуйста, введите любое число: ");
        var number = new Scanner(System.in).nextInt();

        // обработка - processing
        int result = number + 1;

        // отбражение результата - display results
        System.out.println(result);
    }
}
