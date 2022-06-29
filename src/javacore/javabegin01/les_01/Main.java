package javacore.javabegin01.les_01;

public class Main {
    public static void main(String[] args) {

        // объекты, которые может создавать на основе 1 класса
        // переменные ссылаются на объекты

        Car nissan = new Car();     // через ссылки обращаемся к объекту и можем изменять его свойства

        nissan.color = "blue";
        nissan.name = "nissan 1";
        nissan.model = "sedan";
        nissan.drive();

        Car bmw = new Car();
        bmw.color = "Голубой";
        bmw.name = "BMW";
        bmw.model = "sedan";
        bmw.stop();
    }
}
