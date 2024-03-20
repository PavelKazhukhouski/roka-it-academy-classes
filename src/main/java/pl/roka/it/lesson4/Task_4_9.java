package pl.roka.it.lesson4;

/**
 * Created by Pavel Kazhukhouski on 03.02.2024.
 * Начав тренировки, спортсмен в первый день пробежал 10 км.
 * Каждый день он увеличивал дневную норму на 10% нормы предыдущего дня.
 * Какой суммарный путь пробежит спортсмен за 7 дней?
 */
public class Task_4_9 {
    public static void main(String[] args) {

        double totalResult = 0;
        double currentResult = 10;

        totalResult = currentResult;

        for (int i = 0; i < 6; i++) {

           currentResult *= 1.1;
           totalResult += currentResult;

        }
        System.out.println(totalResult + " kilometers");

    }
}
