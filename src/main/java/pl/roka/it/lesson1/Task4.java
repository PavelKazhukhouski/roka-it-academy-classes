package pl.roka.it.lesson1;
/*
Определить число, полученное выписыванием в обратном порядке цифр
любого 4-х значного натурального числа n.
 */

public class Task4 {
    public static void main(String[] args) {
        int number = 4567;

        int thousand = number / 1000;
        int h = number % 1000;
        int hundred = h / 100;
        int t = h % 100;
        int ten = t / 10;
        int unit = t % 10;

        System.out.print(unit);
        System.out.print(ten);
        System.out.print(hundred);
        System.out.print(thousand);

    }
}
