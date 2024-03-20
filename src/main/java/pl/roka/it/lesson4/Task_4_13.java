package pl.roka.it.lesson4;

/**
 * Created by Pavel Kazhukhouski on 03.02.2024.
 * Напишите программу печати таблицы перевода расстояний из дюймов
 * в сантиметры для значений длин от 1 до 20 дюймов. 1 дюйм = 2,54 см
 */
public class Task_4_13 {
    public static void main(String[] args) {

        for (int i = 1; i <= 20; i++) {

            System.out.println(i + " inch = " + i * 2.54 + " centimeters");
        }

    }
}
