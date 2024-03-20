package pl.roka.it.lesson4;

/**
 * Created by Pavel Kazhukhouski on 03.02.2024.
 * Напишите программу вывода всех четных чисел от 2 до 100 включительно
 */
public class Task_4_14 {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i+=2) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
