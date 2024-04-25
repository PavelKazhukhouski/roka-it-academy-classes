package pl.roka.it.lesson16;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * Задание 34.
 * Имеется файл с текстом, в котором присутствуют числа. Найти все числа, распечатать, посчитать сумму,
 * убрать все повторяющиеся числа и снова распечатать.
 */
public class Task_16_2 {
    public static void main(String[] args) {
        String text = "Two 11 roads  1 diverged in a 48 yellow wood,\n" +
                "And 48 sorry 11 I could not travel both 136\n" +
                "And 48 be one 136 traveler, 22 long 25 I stood\n" +
                "And looked 13 down one as far as I could\n" +
                "To 25 where it bent 48 in  44 the undergrowth.";

        try (FileWriter writer = new FileWriter("text2.txt")) {
            writer.write(text);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (BufferedReader reader = new BufferedReader(new FileReader("text2.txt"))) {
            StringBuilder builder = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                builder.append(line).append("\n");
            }
            List<Integer> numbers = new ArrayList<>();
            String[] arrayOfString = builder.toString().split("\\s+");
            int sum = 0;
            for (String s : arrayOfString) {
                try {
                    int num = Integer.parseInt(s);
                    numbers.add(num);
                    sum += num;
                } catch (NumberFormatException e) {
                    System.out.println("Something was wrong " + e.getMessage());
                }
            }
            System.out.println(numbers);
            System.out.println(sum);
            System.out.println(new HashSet<>(numbers));

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
