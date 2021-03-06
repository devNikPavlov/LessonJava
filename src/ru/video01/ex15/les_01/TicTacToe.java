package ru.video01.ex15.les_01;

import java.util.Random;

public class TicTacToe {
    public static void main(String[] args) {
        System.out.println("Use the following mapping table to specify a cell using numbers from 1 to 9:");

        printTableMapping();

        char[][] gameTable = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}
        };

        if (new Random().nextBoolean()) {
            makeComputerMove(gameTable);
            printGameTable(gameTable);
        }
        while (true) {
            makeUserMove(gameTable);
            printGameTable(gameTable);
            if (isUserWin(gameTable)) {
                System.out.println("YOU WIN!");
                break;
            }
            if (isDraw(gameTable)) {
                System.out.println("Sorry, DRAW!");
                break;
            }
            makeComputerMove(gameTable);
            printGameTable(gameTable);
            if (isComputerWin(gameTable)) {
                System.out.println("COMPUTER WIN!");
                break;
            }
            if (isDraw(gameTable)) {
                System.out.println("Sorry, DRAW!");
                break;
            }
        }
        System.out.println("GAME OVER!");
    }

    private static void printTableMapping() {
        char[][] mappingTable = {
                {'7', '8', '9'},
                {'4', '5', '6'},
                {'1', '2', '3'}
        };
        printGameTable(mappingTable);
    }

//    private static void printGameTable(char[][] gameTable) {
//        System.out.println("-------------");
//        System.out.println("| " + gameTable[0][0] + " | " + gameTable[0][1] + " | " + gameTable[0][2] + " |");
//        System.out.println("-------------");
//        System.out.println("| " + gameTable[1][0] + " | " + gameTable[1][1] + " | " + gameTable[1][2] + " |");
//        System.out.println("-------------");
//        System.out.println("| " + gameTable[2][0] + " | " + gameTable[2][1] + " | " + gameTable[2][2] + " |");
//        System.out.println("-------------");
//    }
// ?????????????????? ???????? ???????????????? ???????? ?????????? for

    private static void printGameTable(char[][] gameTable) {
        for (int i = 0; i < 3; i++) {
            System.out.println("-------------");
            for (int j = 0; j < 3; j++) {
                System.out.print("| " + gameTable[i][j] + " ");
            }
            System.out.println("|");
        }
        System.out.println("-------------");
    }

    private static void makeUserMove(char[][] gameTable) {

    }

    private static void makeComputerMove(char[][] gameTable) {
        Random random = new Random();
        while (true) {
            int row = random.nextInt(3);
            int col = random.nextInt(3);
            if (gameTable[row][col] == ' ') {
                gameTable[row][col] = '0';
                return;
            }
        }
    }

    private static boolean isUserWin(char[][] gameTable) {
        return false;
    }

    private static boolean isComputerWin(char[][] gameTable) {
        return false;
    }

    private static boolean isDraw(char[][] gameTable) {
        return false;
    }
}
