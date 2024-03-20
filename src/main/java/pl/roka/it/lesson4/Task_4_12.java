package pl.roka.it.lesson4;

/**
 * Created by Pavel Kazhukhouski on 03.02.2024.
 * Составьте программу, вычисляющую A*B, не пользуясь операцией умножения.
 */
public class Task_4_12 {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int result = 0;

        for (int i = 0; i < a; i++) {
            result += b;
        }

        System.out.println(result);
    }
}
