package pl.roka.it.lesson4;

/**
 * Created by Pavel Kazhukhouski on 03.02.2024.
 * Имеется целое число, определить является ли это число простым, т.е.
 * делится без остатка только на 1 и себя.
 */
public class Task_4_2 {
    public static void main(String[] args) {
        int number = (int) (Math.random() * 20);
        boolean prime = true;
        System.out.println(number);
        System.out.println(Math.sqrt(number));
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                prime = false;
                break;
            }
        }
        if (prime) {
            System.out.println("it's a prime number");
        } else {
            System.out.println("it's not a prime number");
        }


    }

}
