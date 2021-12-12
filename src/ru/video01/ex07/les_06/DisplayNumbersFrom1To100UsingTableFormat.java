package ru.video01.ex07.les_06;

public class DisplayNumbersFrom1To100UsingTableFormat {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            System.out.print(i + "\t");
            if (i % 10 == 0) {
                System.out.println();
            }
        }
    }
}
