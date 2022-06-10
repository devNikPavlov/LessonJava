package ru.book02.exp06.lesson04;

/*
Как пояснялось ранее, каждый объект содержит собственные копии переменных экземпляра. Это означает, что при
наличии 2 объектов класса Box каждый из них будет содержать собственные копии переменных. Следует, однако, иметь
в виду, что изменения в переменных экземпляра одного объекта не влияют на переменные экземпляра другого.
 */

public class BoxDemo2 {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;

        // присвоить значение переменным экземпляра mybox1
        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

        // присвоить другие значения переменным экземпляра mybox2
        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        // рааситать объем первого параллелепипеда
        vol = mybox1.width * mybox1.height * mybox1.depth;
        System.out.println("Объем равен " + vol);

        // рассчитать объем второго параллелепипеда
        vol = mybox2.height * mybox2.width * mybox2.depth;
        System.out.println("Объем равен " + vol);
    }

}
