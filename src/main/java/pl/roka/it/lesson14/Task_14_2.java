package pl.roka.it.lesson14;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * Создать коллекцию, наполнить ее случайными числами. Удалить повторяющиеся
 * числа.
 */
public class Task_14_2 {
    public static void main(String[] args) {
        Set<Integer> uniqueNumbers = new HashSet<>();

        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int temporary = random.nextInt(11);
            System.out.print(temporary + " ");
            uniqueNumbers.add(temporary);
        }

        System.out.println("\n" + uniqueNumbers);
    }
}
