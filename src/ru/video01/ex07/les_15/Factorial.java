package ru.video01.ex07.les_15;

public class Factorial {
    public static void main(String[] args) {

        var value = 30;

        String finalResult;

        if (value < 0) {
            finalResult = "Число должно быть >= 0";
        } else {
            var result = 1;
            for (var i = 1; i <= value; i++) {
                var oldResult = result;
                result *= i;
                if (oldResult != result / i) {
                    result = 0;
                    break;
                }
            }
            finalResult = result == 0 ? "Int overflow" : String.valueOf(result);
        }

        System.out.println(finalResult);
    }
}
