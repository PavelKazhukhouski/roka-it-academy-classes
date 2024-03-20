package pl.roka.it.lesson3;

/*
 * Created by Pavel Kazhukhouski on 20.01.2024.
 * В переменную записываете количество программистов.
 * В зависимости от количества программистов необходимо вывести правильно окончание.
 * Например: • 2 программиста • 1 программиста • 10 программистов • и т.д.
 */
public class Task_3_7 {
    public static void main(String[] args) {

        int programmer = 3;

        if (programmer % 10 == 1) {
            System.out.println(programmer + " программист");
        } else if (programmer % 10 == 2 || programmer % 10 == 3 || programmer % 10 == 4 ) {
            System.out.println(programmer + " программиста");
        } else {
            System.out.println(programmer + " программистов");
        }
    }
}
