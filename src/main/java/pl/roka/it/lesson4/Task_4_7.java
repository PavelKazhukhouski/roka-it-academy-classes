package pl.roka.it.lesson4;

import java.util.Arrays;

/**
 * Created by Pavel Kazhukhouski on 10.02.2024.
 * Определите сумму элементов одномерного массива, расположенных между
 * минимальным и максимальным значениями.
 */
public class Task_4_7 {
    public static void main(String[] args) {

        int[] numbers = {6, 5, 1, 18, 11, 14, 18, 11, 3, 4, 5, 19, 13, 10};
        System.out.println(Arrays.toString(numbers));

        int greatest = numbers[0];
        int greatestIndex = 0;
        int smallest = numbers[0];
        int smallestIndex = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (greatest < numbers[i]) {
                greatest = numbers[i];
                greatestIndex = i;

            } else if (smallest > numbers[i]) {
                smallest = numbers[i];
                smallestIndex = i;
            }

        }

        int startIndex = Math.min(smallestIndex, greatestIndex) + 1;
        int endIndex = Math.max(smallestIndex, greatestIndex);

        int sum = 0;
        for (int i = startIndex; i < endIndex; i++) {
            sum += numbers[i];
        }
        System.out.println("sum of array elements " + sum);


    }
}
