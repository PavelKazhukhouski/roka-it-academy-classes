package pl.roka.it.lesson2;

import java.util.Scanner;

/*
Создайте число. Определите, является ли число трехзначным. Определите, является
ли его последняя цифра семеркой. Определите, является ли число четным.
 */
public class Task_2_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number >= 100 && number <= 1000) {
            System.out.println("the number is three digits");
        } else {
            System.out.println("the number is not three digits");
        }
        if (number % 100 == 7) {
            System.out.println("last digit is a seven");
        } else {
            System.out.println("last digit is not a seven");
        }
        if (number % 2 == 0) {
            System.out.println("the number is even");
        } else {
            System.out.println("the number is not even");
        }

    }


}
