package ru.video01.ex07.les_16;

public class Continue {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            if (i >= 3 && i <= 6) {
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();

        // Старайтесь не использовать continue
        // Вычисление другим способом
        for (int i = 0; i < 10; i++) {
            if (i < 3 || i > 6) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
