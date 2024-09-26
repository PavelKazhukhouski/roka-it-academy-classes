package pl.roka.it.lesson16;

import java.io.*;
import java.util.Random;

/**
 * Задание 35.
 * Записать в двоичный файл 20 случайных чисел. Прочитать записанный файл, распечатать числа и их среднее
 * арифметическое.
 */
public class Task_16_3 {
    public static void main(String[] args) {
        try (DataOutputStream outputStream = new DataOutputStream(new FileOutputStream("ints.bin"))) {
            Random random = new Random();
            for (int i = 0; i < 20; i++) {
                outputStream.writeInt(random.nextInt(100));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (DataInputStream inputStream = new DataInputStream(new FileInputStream("ints.bin"))) {
            int counter = 0;
            int number;
            int sum = 0;
            while (inputStream.available() > 0) {
                try {
                    number = inputStream.readInt();
                    System.out.print(number + ",");
                    sum += number;
                    counter++;
                } catch (EOFException e) {
                    break;
                }
            }

            System.out.println();
            System.out.println(sum / counter);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
