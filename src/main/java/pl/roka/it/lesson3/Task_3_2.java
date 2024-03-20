package pl.roka.it.lesson3;

/*
 * Created by Pavel Kazhukhouski on 20.01.2024.
 * Треугольник существует только тогда, когда сумма любых двух его сторон больше третьей.
 * Определить существует ли такой треугольник. Дано: a, b, c –стороны предполагаемого треугольника.
 * Требуется сравнить длину каждого отрезка-стороны с суммой двух других.
 * Если хотя бы в одном случае отрезок окажется больше суммы двух других,
 * то треугольника с такими сторонами не существует.
 */
public class Task_3_2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        int c = 20;

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("the triangle exists");
        } else System.out.println("the triangle doesn't exist");
    }
}
