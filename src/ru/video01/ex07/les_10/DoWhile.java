package ru.video01.ex07.les_10;

public class DoWhile {
    public static void main(String[] args) {

        {
            var i = 100;
            while (i >= 1) {
                System.out.print(i-- + " ");
            }
            System.out.println();
        }

        // таже реализация, только с do-while. Отличее этого цикла от циклов for & while - он делает хотя бы 1 действие
        {
             var i = 100;
             do {
                 System.out.print(i-- + " ");
             } while (i >= 1);
            System.out.println();
        }
    }
}
