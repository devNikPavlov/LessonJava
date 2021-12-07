package javacore.project_07.les_01;

public class Task_01 {
    public static void main(String[] args) {

       int value = 0;
       do {
           System.out.println(value);
           value++;
       } while(value < 10);
    }

    public static void whileExample() {
        int value = 10;

        while (value > 0) {
            System.out.println(value);
            value--;
        }
    }
}
