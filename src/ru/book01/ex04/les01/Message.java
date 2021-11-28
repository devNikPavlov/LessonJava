//TODO Методы String

package ru.book01.ex04.les01;

public class Message {
    public static void main(String[] args) {

        String message = "Hello World!";

        // Методы String
        // Метод length() - сообщает общее количество символов, содержащихся в строке
        System.out.println(message.length());

        // Метод toUpperCase() - используется для преобразования строки к верхнему регистру
        System.out.println(message.toUpperCase());

        // Метод toLowerCase() - используется для преобразования строки к нижнему регистру
        System.out.println(message.toLowerCase());

        // Метод substring() - предназначен для выделения подстроки из более длинной строки
        // Первый вариант - начало с 6 позиции
        // Второй вариант - начало с 1 позиции по 8 позицию
        System.out.println(message.substring(6));
        System.out.println(message.substring(1, 8));

        // Метод charAt() - возращает 1 символ, находящийся в заданной позиции
        System.out.println(message.charAt(0));

        // Метод equals() - используется для проверки равенства 2 строк
        System.out.println(message.equals("Hello World!"));

    }
}
