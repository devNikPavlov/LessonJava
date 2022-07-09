package javacore.videodim.project01.section05.les_01;

//TODO Преобразование типов

public class TypeCast {
    public static void main(String[] args) {

        int num = 1;
        char ch = '1';
        String s = "1";

        // int, double, boolean, char, String

        String is = String.valueOf(1);
        String ia = String.valueOf(1.0);
        String iq = String.valueOf(true);
        String iw = String.valueOf('a');

        int di = Integer.parseInt("12");
        double sd = Double.parseDouble("1.2");
        boolean sf = Boolean.parseBoolean("true");
        char sj = "a".charAt(0);
        char sg = "asd".charAt(2);
        System.out.println(sg);
    }
}
