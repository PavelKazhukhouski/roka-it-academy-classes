package pl.roka.it.lesson3;

/*
 * Created by Pavel Kazhukhouski on 20.01.2024.
 * Даны 3 целых числа. Найти количество положительных и отрицательных чисел в исходном наборе.
 */
public class Task_3_5 {
    public static void main(String[] args) {
        int a = 1, b = -1, c = -1;
        int plus = 0;
        int minus = 0;

        if (a > 0) plus++;
        else if (a < 0) minus++;

        if (b > 0) plus++;
        else if (b < 0) minus++;

        if (c > 0) plus++;
        else if (c < 0) minus++;

        System.out.println(plus + " positive numbers");
        System.out.println(minus + " negative numbers");
    }
}
