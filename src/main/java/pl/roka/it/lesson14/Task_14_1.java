package pl.roka.it.lesson14;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 * Создать список оценок учеников с помощью ArrayList, заполнить случайными
 * оценками. Удалить неудовлетворительные оценки из списка.
 */
public class Task_14_1 {
    public static void main(String[] args) {
        List<Integer> grades = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            grades.add(random.nextInt(5) + 1);
        }

        System.out.println(grades);

        Iterator<Integer> iterator = grades.iterator();

        while (iterator.hasNext()) {
            if (iterator.next() < 4) {
                iterator.remove();
            }
        }
        System.out.println(grades);
    }


}
