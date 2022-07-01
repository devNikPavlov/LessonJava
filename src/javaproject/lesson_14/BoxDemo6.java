package javaproject.lesson_14;

//TODO Введение в конструкторы

//пример класса Box можно переделать, чтобы значения размеров параллелепипеда присваивались при конструировании
//объектов. Для этого придется заменить метод setDim() конструктором.

class Box6 {
    double width;
    double height;
    double depth;

    // это конструктор класса Box
    Box6() {
        System.out.println("Конструктор объекта Box");
        width = 10;
        height = 10;
        depth = 10;
    }

    // рассчитать и возвратить объем
    double volume() {
        return width * height * depth;
    }
}

public class BoxDemo6 {
    public static void main(String[] args) {
        Box6 mybox1 = new Box6();
        Box6 mybox2 = new Box6();
        double vol;

        // получить объем 1 параллелепипеда
        vol = mybox1.volume();
        System.out.println("Объем равен " + vol);

        // получить объем 2 параллелепипеда
        vol = mybox2.volume();
        System.out.println("Объем равен " + vol);
    }
}
