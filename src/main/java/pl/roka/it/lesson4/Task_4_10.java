package pl.roka.it.lesson4;

/**
 * Created by Pavel Kazhukhouski on 03.02.2024.
 * Одноклеточная амеба каждые 3 часа делится на 2 клетки.
 * Определить, сколько амеб будет через 3, 6, 9, 12,..., 24 часа.
 */
public class Task_4_10 {
    public static void main(String[] args) {
        int amoebas = 1;

        for (int i = 0; i < 24; i += 3) {

            amoebas *= 2;

            System.out.println(i + " o'clock - quantity " + amoebas + " pcs.");
        }

    }
}
