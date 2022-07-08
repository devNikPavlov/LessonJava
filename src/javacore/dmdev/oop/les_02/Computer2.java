package javacore.dmdev.oop.les_02;

public class Computer2 {
    int ssd = 500;
    int ram = 1024;

    Computer2() {
        System.out.println("Я был создан");
    }

    Computer2(int newSsd) {
        ssd = newSsd;
    }

    Computer2(int newSsd, int newRam) {
        ssd = newSsd;
        ram = newRam;
    }

    void printState() {
        System.out.println("Ssd: " + ssd);
        System.out.println("ram: " + ram);
        System.out.println();
    }
}
