package javacore.dmdev.oop.les_01;

public class TestExample {
    public static void main(String[] args) {

        // объявляем объект
        Computer comp = new Computer();

        comp.load();
        System.out.println("Ram: " + comp.ram);
        System.out.println("SSD: " + comp.ssd);

    }
}
