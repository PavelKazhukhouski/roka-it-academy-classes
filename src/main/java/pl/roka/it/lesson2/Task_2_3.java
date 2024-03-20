package pl.roka.it.lesson2;

import java.util.Random;

/*
 * Created by Pavel Kazhukhouski on 20.01.2024.
 * Имеется целове число (задать с помощью Random rand = new Random(); int x =
 * rand.nextInt() ). Это число – количесво денег в рублях. Вывести это число, добавив к
 * нему слово «рублей» в правильном падеже.
 */
public class Task_2_3 {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt();

        if (number % 10 == 1) {
            System.out.println(number + " рубль");
        } else if (number % 10 == 2 || number % 10 == 3 || number % 10 == 4) {
            System.out.println(number + " рубля");
        } else {
            System.out.println(number + " рублей");
        }
    }
}
