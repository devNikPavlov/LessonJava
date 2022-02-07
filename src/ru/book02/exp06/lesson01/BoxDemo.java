package ru.book02.exp06.lesson01;

/*
Программа, использующая класс Box
Присвоить исходному файлу имя BoxDemo.java
 */

class Box {
    double width;
    double height;
    double depth;
}

// В этом классе объявляется объект типа Box

public class BoxDemo {
    public static void main(String[] args) {
        Box mybox = new Box();
        double vol;

        // присвоить значение переменным экземпляра mybox
        mybox.width = 10;
        mybox.height = 20;
        mybox.depth = 15;

        // рассчитать объем параллелипипеда
        vol = mybox.width * mybox.height * mybox.depth;

        System.out.println("Объем равен " + vol);
    }
}













