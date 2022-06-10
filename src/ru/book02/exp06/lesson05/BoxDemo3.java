package ru.book02.exp06.lesson05;

/*
Ввод метода в класс Box
В большенстве случаев для доступа к переменным экземпляра, определенным в классе, приходится пользоваться методами.
По существу, методы определяют интерфейс для большинства классов.
 */

public class BoxDemo3 {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();

        // присвоить значение переменным экземпляра mybox1
        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

        // присвоить другие значения переменным экземпляра mybox2
        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        // вывести объем первого параллелепипеда
        mybox1.volume();

        // вывести объем второго параллелепипеда
        mybox2.volume();
    }
}
