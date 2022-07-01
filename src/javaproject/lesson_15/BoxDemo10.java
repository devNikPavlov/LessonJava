package javaproject.lesson_15;

//TODO Перегрузка конструкторов

// в данном примере конструкторы определяются в классе Box для инициализации размеров параллелепипеда тремя разными способами

import ru.book02.exp06.lesson07.Box;

class Box10 {
    double width;
    double height;
    double depth;

    // конструктор, используемый, когда указывается все размеры
    Box10(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // конструктор, используемый, когда ни один из размеров не указан
    Box10() {
        width = -1;     // использовать значение -1 для обозначения неинициализированного параллелепипеда
        height = -1;
        depth = -1;
    }

    // конструктор, используемый при создании куба
    Box10(double len) {
        width = height = depth = len;
    }

    // рассчитать и возвратить объем
    double volume() {
        return width * height * depth;
    }
}

public class BoxDemo10 {
    public static void main(String[] args) {

        // создать параллелепипеды, используя разные конструкторы
        Box10 mybox1 = new Box10(10, 20, 15);
        Box10 mybox2 = new Box10();
        Box10 mycube = new Box10(7);

        double vol;

        // получить объем 1 параллелепипеда
        vol = mybox1.volume();
        System.out.println("Объем mybox1 равен " + vol);

        // получить объем 2 параллелепипеда
        vol = mybox2.volume();
        System.out.println("Объем mybox2 равен " + vol);

        // получить объем куба
        vol = mycube.volume();
        System.out.println("Объем mycube равен " + vol);
    }
}















