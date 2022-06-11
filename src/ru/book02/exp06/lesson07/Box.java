package ru.book02.exp06.lesson07;

/*
в отношении методов важно различать 2 термина: Параметр и Аргумент
Параметр - это определенная в методе переменная, которая принимает заданное значение при вызове метода.
Аргумент - это значение, передаваемое методу при его вызове.
 */

public class Box {

    double width;
    double height;
    double depth;

    // рассчитать и возвратить объем
    double volume() {
        return width * height * depth;
    }

    // установить размеры параллелепипеда
    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
}
