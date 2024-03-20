package pl.roka.it.lesson2;

import java.util.Scanner;

/*
Имеется прямоугольное отверстие размерами a и b, определить, можно ли его
полностью закрыть круглой картонкой радиусом r.
 */
public class Task_2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter width");
        float a = scanner.nextFloat();
        System.out.println("enter height");
        float b = scanner.nextFloat();
        System.out.println("enter radius");
        float radius = scanner.nextFloat();

        float diagonal = (a * 2 + b * 2) / 4;
        System.out.println(diagonal);

        if (diagonal > radius * 2) System.out.println("the hole can't be closed");
        else System.out.println("the hole can be closed");


    }

}
