package javacore.videodim.project01.section05.les_03;

//TODO Погрешности работы с числами с плавающей точкой

import java.math.BigDecimal;

public class DoubleAccuracyIssues {
    public static void main(String[] args) {

        var a = 2;
        var b = 1.1;
        var c = a - b;
        System.out.println("Вариант 1: " + c);
    }
    static {
        BigDecimal a = new BigDecimal("2");
        BigDecimal b = new BigDecimal("1.1");
        BigDecimal c = a.subtract(b);
        System.out.println("Вариан второй: " + c);
    }
}
