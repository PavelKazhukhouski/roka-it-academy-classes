package pl.roka.it.lesson4;

/**
 * Created by Pavel Kazhukhouski on 03.02.2024.
 * Изменить пример с суммой чисел таким образом, чтобы рассчитывалась не сумма, а
 * произведение, т.е. факториал числа.
 */
public class Task_4_0 {
    public static void main(String[] args) {
        double factorial = 1;
        int number = (int) (Math.random() * 20);
        System.out.println(number);
        while (number != 0) {
            factorial *= number;
            number--;
        }
        System.out.println(factorial);


    }
}
