package javaproject.lesson_01;

//TODO Пример, тип числа с плавающей точкой

// Вычислить площадь круга

public class Area {
    public static void main(String[] args) {
        double pi, r, a;

        r = 10.8;                       // радиус круга
        pi = 3.1416;                    // приблизительное значение числа ПИ
        a = pi * r * r;                 // вычислить площадь круга

        System.out.println("Площадь круга равна " + a);
    }
}
