package pl.roka.it.lesson1;

import java.util.Scanner;

/*
Дано любое натуральное 4-х значное число. Верно ли, что все цифры числа
различны?
 */
public class Task5 {
    public static void main(String[] args) {
        System.out.println("Введите четырех значное число :");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("All numbers are different : " + areTheNumbersEqual(number) );

    }
    public static boolean areTheNumbersEqual(int num) {
        int thousand = num / 1000;
        int hundred = (num / 100) % 10;
        int ten = (num / 10) % 10;
        int unit = num % 10;

        return (thousand != hundred && thousand != ten && thousand != unit &&
                hundred != ten && hundred != unit && ten != unit);
    }

}
