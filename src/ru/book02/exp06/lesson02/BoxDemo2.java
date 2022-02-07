package ru.book02.exp06.lesson02;

/*
В этой программе объявляются два объекта класса Box
 */

class Box {
    double width;
    double height;
    double depth;
}

public class BoxDemo2 {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;

        // присвоить значения переменным экземпляра mybox1
        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

        // присвоить другие значения переменным экземпляра mybox2
        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        // рассчитать объем первого параллелипипеда
        vol = mybox1.width * mybox1.height * mybox1.depth;
        System.out.println("ОБъем равен " + vol);

        // рассчитать объем второго параллелипипеда
        vol = mybox2.width * mybox2.height * mybox2.depth;
        System.out.println("ОБъем равен " + vol);
    }
}
