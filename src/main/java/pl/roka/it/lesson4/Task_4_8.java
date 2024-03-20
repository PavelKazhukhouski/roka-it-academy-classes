package pl.roka.it.lesson4;

import java.util.Arrays;

/**
 * Created by Pavel Kazhukhouski on 03.02.2024.
 * Создать двухмерный квадратный массив, и заполнить его «бабочкой»
 * 1 1 1 1 1
 * 0 1 1 1 0
 * 0 0 1 0 0
 * 0 1 1 1 0
 * 1 1 1 1 1
 */
public class Task_4_8 {
    public static void main(String[] args) {
        int[][] butterfly = new int[5][5];

        for (int i = 0; i < butterfly.length; i++) {
            for (int j = 0; j < butterfly[i].length; j++) {
                butterfly[i][j] = 1;
            }
        }

        for (int i = 0; i <= butterfly.length / 2; i++) {
            for (int j = 0; j < i; j++) {
                butterfly[i][j] = 0;
                butterfly[butterfly.length - 1 - i][j] = 0;
            }
        }

        for (int i = butterfly.length - 1; i >= butterfly.length / 2; i--) {
            for (int j = butterfly[i].length - 1; j > i; j--) {
                butterfly[i][j] = 0;
                butterfly[butterfly.length - 1 - i][j] = 0;

            }
        }

        for (int i = 0; i < butterfly.length; i++) {
            for (int j = 0; j < butterfly[i].length; j++) {
                System.out.print(butterfly[i][j] + " ");
            }
            System.out.println();

        }

    }
}
