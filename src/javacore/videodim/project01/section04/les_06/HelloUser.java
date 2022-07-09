package javacore.videodim.project01.section04.les_06;

//TODO Реализация - Программа приветствия

import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {

        //  1
        System.out.println("Как вас зовут? ");
        String name = new Scanner(System.in).nextLine();

        //  2
        String result = "Привет, " + name;

        //  3
        System.out.println(result);
    }
}
