// Цикл for: варивции

package ru.video01.ex07.les_03;

public class ForExample {
    public static void main(String[] args) {

        // вариант i=0, и оно меньше 5, тут идет от 1 до 5
        for (int i=0; i<5; i++) {
            System.out.print(i + 1 + " ");
        }
        System.out.println();

        // выводим в обратном порядке от 5 до 1
        for (int i=4; i>=0; i--) {
            System.out.print(i + 1 + " ");
        }
        System.out.println();

        //
        for (int i=50; i<=100; i+=5) {
            System.out.print(i + " ");
        }
        System.out.println();

    }
}
