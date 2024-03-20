package pl.roka.it.lesson4;

/**
 * Created by Pavel Kazhukhouski on 03.02.2024.
 * Найдите сумму первых n целых чисел, которые делятся на 3.
 */
public class Task_4_3 {
    public static void main(String[] args) {
        int quantity = 3;
        int sum = 0;
        for (int i = 1; i <= quantity; i++) {
            sum += i * 3;
        }
        System.out.println(sum);
    }
}
