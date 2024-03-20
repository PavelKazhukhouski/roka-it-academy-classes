package pl.roka.it.lesson4;

/**
 * Created by Pavel Kazhukhouski on 03.02.2024.
 * Напишите программу, определяющую сумму всех нечетных чисел от 1 до 99
 */
public class Task_4_15 {
    public static void main(String[] args) {

        int result = 0;

        for (int i = 1; i < 100; i+=2) {
            if (i % 2 != 0) {
                result += i;
            }

        }
        System.out.println(result);
    }
}
