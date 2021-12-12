package ru.video01.ex07.les_07;

public class While {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // другая запись цикла for
        {
            int i = 0;
            for (; i < 5; ) {
                System.out.print(i++ + " ");
            }
            System.out.println();
        }

        // можно так же зделать циклом while
        {
            int i = 0;
            while (i < 5) {
                System.out.print(i++ + " ");
            }
            System.out.println();
        }
    }
}
