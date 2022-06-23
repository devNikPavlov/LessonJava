package javaproject.lesson_12;

//TODO Простой класс

// пример программы, в которой используется класс

class Box {
    double width;
    double height;
    double depth;
}

// в этом классе объявляется объект типа Box
public class BoxDemo {
    public static void main(String[] args) {
        Box mybox = new Box();
        double vol;

        // присвоить значение переменным экземпляра mybox
        mybox.width = 10;
        mybox.height = 20;
        mybox.depth = 15;

        // рассчитать объем параллелепипеда
        vol = mybox.width * mybox.height * mybox.depth;

        System.out.println("Объем равен " + vol);
    }
}


