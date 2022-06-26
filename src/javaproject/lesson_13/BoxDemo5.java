package javaproject.lesson_13;

//TODO ВВедение в методы. Возврат значений

// в этой программе применятеся метод с параметрами

class Box5 {
    double width;
    double height;
    double depth;

    // рассчитать и возвратить объем
    double volume() {
        return width * height * depth;
    }

    // установить размера параллелепипеда
    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
}

public class BoxDemo5 {
    public static void main(String[] args) {
        Box5 mybox1 = new Box5();
        Box5 mybox2 = new Box5();
        double vol;

        // инициализировать каждый экземпляр класса Box5
        mybox1.setDim(10, 20, 15);
        mybox2.setDim(3, 6, 9);

        // получить объем 1 параллелепипеда
        vol = mybox1.volume();
        System.out.println("Объем равен " + vol);

        // получить объем 2 параллелепипеда
        vol = mybox2.volume();
        System.out.println("Объем равен " + vol);
    }
}


















