package javacore.dmdev.oop.les_02;

public class ComputerRunner2 {
    public static void main(String[] args) {

        Computer2 comp2 = new Computer2();
        comp2.printState();

        Computer2 comp3 = new Computer2(1050);
        comp3.printState();

        Computer2 comp4 = new Computer2(1050, 2048);
        comp4.printState();
    }
}
