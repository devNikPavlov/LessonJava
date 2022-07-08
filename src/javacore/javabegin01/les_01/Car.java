package javacore.javabegin01.les_01;

// класс (трафарет)
// название класса - с большой буквы
// название public класса должно совпадать с названием файла

public class Car {

    // название переменных - с маленькой буквы
    // сначала описываем все свойства (поля) класса. В конце всегда ;

    String name = "Toyota";     // название
    String model;               // модель
    String color;               // цвет

    // также описываем методы (действия)

    // название метода - с маленькой буквы
    // название метода должно быть понятным по смыслу (что делает метод)
    void drive() {              // данный метод ничего не возвращает
        System.out.println("drive");
    }

    void stop() {               // данный метод ничего не возвращает
        System.out.println("stop");
    }

}