package javacore.videodim.project01.section04.les_04;

//TODO Считывание с консоли

import java.util.Scanner;

public class In {
    public static void main(String[] args) {

        var a = new Scanner(System.in).nextInt();
        var b = new Scanner(System.in).nextInt();

        System.out.println(a + b);

        var d = new Scanner(System.in).nextDouble();
        System.out.println(d);

        var bool = new Scanner(System.in).nextBoolean();
        System.out.println(bool);

        var ch = new Scanner(System.in).next().charAt(0);
        System.out.println(ch);

        var s = new Scanner(System.in).nextLine();
        System.out.println(s);


    }
}
