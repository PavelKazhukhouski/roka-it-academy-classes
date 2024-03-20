package pl.roka.it.lesson4;

import java.util.Arrays;

/**
 * Created by Pavel Kazhukhouski on 03.02.2024.
 * Создать массив, заполнить его случайными элементами, распечатать,
 * перевернуть, и снова распечатать (при переворачивании нежелательно создавать
 * еще один массив).
 */
public class Task_4_6 {
    public static void main(String[] args) {
        int[] numbers = new int[(int) (Math.random() * 20)];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 20);
        }
        System.out.println(Arrays.toString(numbers));

        int temporary = 0;

        for (int i = 0; i < numbers.length / 2; i++) {
            temporary = numbers[i];
            numbers[i] = numbers[(numbers.length - 1) - i];
            numbers[(numbers.length - 1) - i] = temporary;

        }
        System.out.println(Arrays.toString(numbers));
    }
}
