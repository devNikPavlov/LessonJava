package ru.video01.ex06.les_11;

public class WeekDayWithSwitch {
    public static void main(String[] args) {

        var day = 5;

        String result;
        switch (day) {
            case 1: {
                result = "Понедельник";
                break;
            }

            case 2: {
                result = "Вторник";
                break;
            }

            case 3: {
                result = "Среда";
                break;
            }

            case 4: {
                result = "Четверг";
                break;
            }

            case 5: {
                result = "Пятница";
                break;
            }

            case 6: {
                result = "Суббота";
                break;
            }

            case 7: {
                result = "Воскресенье";
                break;
            }

            default: {
                result = "Invalid day";
            }
        }

        System.out.println(result);
    }
}
