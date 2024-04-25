package pl.roka.it.lesson16;

import java.io.File;
import java.util.Arrays;

/**
 * Задание 36.
 * Вывести список файлов и каталогов выбранного каталога на диске. Файлы и каталоги должны быть
 * распечатаны отдельно.
 */
public class Task_16_4 {
    public static void main(String[] args) {
        File directory = new File("src/main/java/pl/roka/it");

        if (directory.exists() && directory.isDirectory()) {
            File[] files = directory.listFiles();

            for (File file : files) {
                if (file.isDirectory()) {
                    System.out.println("Директория: " + file.getName());
                }
            }

            for (File file : files) {
                if (file.isFile()) {
                    System.out.println("Файл: " + file.getName());
                }
            }
        }


    }
}
