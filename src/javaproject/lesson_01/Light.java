package javaproject.lesson_01;

//TODO Пример использования типов данных

// Вычислить расстояние, проходимое светом, используя переменные типы long

public class Light {
    public static void main(String[] args) {
        int lightspeed;
        long days;
        long second;
        long distance;

        // приблизительная скорость света, миль в секунду
        lightspeed = 186000;

        days = 1000;    // указать количество дней

        second = days * 24 * 60 * 60;       // преобразовать в секунды

        distance = lightspeed * second;     // вычислить растояние

        System.out.print("За " + days);
        System.out.print(" дней свет пройдет около ");
        System.out.println(distance + " миль.");
    }
}
