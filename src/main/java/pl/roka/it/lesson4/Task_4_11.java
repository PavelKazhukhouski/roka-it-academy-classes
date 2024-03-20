package pl.roka.it.lesson4;

/**
 * Created by Pavel Kazhukhouski on 03.02.2024.
 * Вычислить: 1+2+4+8+...+256
 */
public class Task_4_11 {
    public static void main(String[] args) {
        int result = 0;
        for (int i = 1; i <= 256; i *= 2) {
            System.out.println(i);
            result += i;
            //System.out.println(result);
        }
        System.out.println(result);
    }
}
