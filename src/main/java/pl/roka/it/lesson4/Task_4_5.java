package pl.roka.it.lesson4;

import java.util.Arrays;

/**
 * Created by Pavel Kazhukhouski on 03.02.2024.
 * Создать массив оценок произвольной длины, вывести максимальную и
 * минимальную оценку, её (их) номера.
 */
public class Task_4_5 {
    public static void main(String[] args) {

        int[] numbers = new int[(int) (Math.random() * 20)];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 20);
        }
        System.out.println(Arrays.toString(numbers));

        int greatest = numbers[0];
        int smallest = numbers[0];

        for (int i = 0; i < numbers.length; i++) {

            if (greatest < numbers[i]) {
                greatest = numbers[i];
            }
            if (smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }
        System.out.println("greatest number is " + greatest);
        System.out.println("smallest number is " + smallest);
    }
}
