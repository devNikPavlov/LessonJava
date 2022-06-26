package javaproject.lesson_13;

//TODO ВВедение в методы

// в этой программе применяется метод, введенный в класс Box

import ru.book02.exp06.lesson07.Box;

class Box3 {
    double width;
    double height;
    double depth;

    // вывести объем параллелепипеда
    void volume() {
        System.out.print("Объем равен ");
        System.out.println(width * height * depth);
    }

}

public class BoxDemo3 {
    public static void main(String[] args) {
        Box3 mybox1 = new Box3();
        Box3 mybox2 = new Box3();

        // присвоить значение переменным экземпляра mybox1
        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

        // присвоить значение переменным экземпляра mybox2
        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        // вывести объем 1 параллелепипеда
        mybox1.volume();

        // вывести объем 2 параллелепипеда
        mybox2.volume();
    }
}
