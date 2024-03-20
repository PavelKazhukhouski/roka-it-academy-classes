package pl.roka.it.lesson3;

import java.util.Scanner;

/*
 * Created by Pavel Kazhukhouski on 21.01.2024.
 * В переменную записываем число. Надо вывести на экран сколько в этом числе цифр и положительное
 * оно или отрицательное. Например, "это однозначное положительное число". Достаточно будет определить,
 * является ли число однозначным, "двухзначным или трехзначным и более.
 */
public class Task_3_1 {
    public static void main(String[] args) {

        int number = -777;
        String count = String.valueOf(number);

        if (number > 0) {
            System.out.println("the number is positive and has " + count.length() + " digits");
        } else if (number < 0) {
            System.out.println("the number is negative and has " + (count.length() - 1) + " digits");
        } else System.out.println("the number is zero");
    }
}
