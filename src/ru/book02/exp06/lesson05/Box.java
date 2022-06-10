package ru.book02.exp06.lesson05;

// в этой программе применяется метод, введенный в класс Box

public class Box {
    double width;
    double height;
    double depth;

    // вывести объем параллелепипеда
    void volume() {
        System.out.print("Объем равен ");
        System.out.println(width * height * depth);
    }
}
