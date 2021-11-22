package ru.video01.ex05.les_02;

public class TypeCast {
    public static void main(String[] args) {

        int num = 1;
        char ch = '1';
        String str = "1";

        String is = String.valueOf(1);
        String ds = String.valueOf(1.1);
        String bs = String.valueOf(true);
        String cs = String.valueOf('a');

        int si = Integer.parseInt("12");
        double sd = Double.parseDouble("12");
        boolean sb = Boolean.parseBoolean("true");

        char ch1 = "a".charAt(0);
        char ch2 = "abc".charAt(1);     // будет выводится буква b
    }
}
