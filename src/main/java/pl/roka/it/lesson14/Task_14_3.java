package pl.roka.it.lesson14;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

/**
 * Создать список оценок учеников с помощью ArryList, заполнить случайными
 * оценками. Найти самую высокую оценку с использованием итератора.
 */
public class Task_14_3 {
    public static void main(String[] args) {
        List<Integer> grades = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            grades.add(random.nextInt(10) + 1);
        }

        System.out.println(grades);

        ListIterator<Integer> iterator = grades.listIterator();

        int maxGrade = 0;

        while (iterator.hasNext()) {
            int cursor = iterator.next();
            if (cursor > maxGrade) {
                maxGrade = cursor;
            }
        }
        System.out.println(maxGrade);
    }
}
