package ru.video01.ex07.les_05;

public class DisplayEvenNumbersFrom0To50 {
    public static void main(String[] args) {

        var from = 0;
        var to = 50;
        var step = 2;

        for (int i = from; i <= to; i += step) {
            System.out.print(i + " ");
        }

        System.out.println();
    }
}
