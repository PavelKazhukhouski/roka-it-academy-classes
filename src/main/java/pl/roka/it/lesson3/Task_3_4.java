package pl.roka.it.lesson3;

/*
 * Created by Pavel Kazhukhouski on 20.01.2024.
 * Даны 3 целых числа. Найти количество положительных чисел в исходном наборе.
 */
public class Task_3_4 {
    public static void main(String[] args) {
        int a = 1, b = 33, c = -1;
        int count = 0;

        if (a > 0) count++;

        if (b > 0) count++;

        if (c > 0) count++;


        System.out.println(count + " positive numbers");
    }

}
