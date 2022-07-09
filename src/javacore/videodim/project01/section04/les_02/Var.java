package javacore.videodim.project01.section04.les_02;

//TODO Понятие переменной

public class Var {
    public static void main(String[] args) {

        var text = "Hello Java!";

        System.out.println(text);

        text = "I love Java";
        System.out.println(text);

        text = "Hello " + System.getProperty("user.name");
        System.out.println(text);
    }
}
