package pl.roka.it.lesson4;

/**
 * Created by Pavel Kazhukhouski on 03.02.2024.
 * Посчитать факториал числа в границах от 10 до 15 (не используя рекурсию).
 */

public class Task_4_1 {
    public static void main(String[] args) {
        int number = 15;
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }
        System.out.println(factorial);


    }
}
