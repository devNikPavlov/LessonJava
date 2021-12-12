package ru.video01.ex07.les_11;

public class SumFrom1To100 {
    public static void main(String[] args) {

        var x = 1;
        var y = 0;
        for (int i = x; i <= 100; i++) {
            System.out.print(i + " ");
            y = y + i;
        }
        System.out.println();
        System.out.println(y);
    }
}
