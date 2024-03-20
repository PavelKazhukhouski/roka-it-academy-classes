package pl.roka.it.tic_tac_toe;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        // Создание поля
        char[][] field = {{'1', '2', '3'}, {'4', '5', '6'}, {'7', '8', '9'}};
        char playerSign = 'x';
        int numberOfMovesMade = 0;

        while (true) {

            // Печать поля.
            for (int i = 0; i < field.length; i++) {
                for (int j = 0; j < field[i].length; j++) {
                    System.out.print(field[i][j] + " ");
                }
                System.out.println();
            }
            //Ввод координат.
            Scanner scanner = new Scanner(System.in);
            char coordinate = scanner.next().charAt(0);

            boolean isWrongCoordinate = true;
            //Установка символа на поле.
            for (int i = 0; i < field.length; i++) {
                for (int j = 0; j < field[i].length; j++) {
                    if (field[i][j] == coordinate) {
                        field[i][j] = playerSign;
                        numberOfMovesMade++;
                        isWrongCoordinate = false;
                        break;
                    }
                }
            }
            //Проверка координаты.
            if (isWrongCoordinate) {
                System.out.println("Coordinate is wrong! Try agan!");
                continue;
            }

            // Проверка выигрыша в строках и столбцах
            for (int i = 0; i < 3; i++) {
                boolean rowWin = true;
                boolean colWin = true;

                for (int j = 0; j < 3; j++) {
                    if (field[i][j] != playerSign) {
                        rowWin = false;
                    }
                    if (field[j][i] != playerSign) {
                        colWin = false;
                    }
                }

                if (rowWin || colWin) {
                    System.out.println("Player " + playerSign + " Wins");
                    return;
                }
            }

            //Проверка выигрыша по диагоналям.
            boolean diag1Win = true;
            boolean diag2Win = true;
            for (int i = 0; i < 3; i++) {
                if (field[i][i] != playerSign) {
                    diag1Win = false;
                }
                if (field[i][2 - i] != playerSign) {
                    diag2Win = false;
                }

            }
            if (diag1Win || diag2Win) {
                System.out.println("Player " + playerSign + " Wins");
                break;

            }
            //Проверка, заполнено ли поле.
            if (numberOfMovesMade == field.length * field[0].length) {
                System.out.println("Draw!");
                break;
            }

            //Переход хода.
            playerSign = playerSign == 'x' ? 'o' : 'x';


        }

    }
}
