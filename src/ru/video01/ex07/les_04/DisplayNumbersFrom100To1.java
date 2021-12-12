package ru.video01.ex07.les_04;

public class DisplayNumbersFrom100To1 {
    public static void main(String[] args) {

        //мое решение
//        for (var i=100; i>=1; i--) {
//            System.out.print(i + " ");
//        }

        // можно еще и так

        var from = 100;
        var to = 1;
        var step = 1;

        for (int i = from; i >= to; i -= step) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
