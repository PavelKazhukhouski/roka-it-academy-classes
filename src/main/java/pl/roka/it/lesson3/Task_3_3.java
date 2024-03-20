package pl.roka.it.lesson3;

import java.util.Scanner;

/*
 * Created by Pavel Kazhukhouski on 20.01.2024.
 * Дано целое число. Если оно является положительным, то прибавить к нему 1.
 * Если отрицательным, то вычесть из него 2.
 * Если нулевым, то заменить его на 10. Вывести полученное число
 */
public class Task_3_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number");
        int number = scanner.nextInt();
        if (number > 0) {
            ++number;
            System.out.println(number);
        } else if (number < 0) {
            number -= 2;
            System.out.println(number);
        } else if (number == 0) {
            number = 10;
            System.out.println(number);
        }
    }
}
