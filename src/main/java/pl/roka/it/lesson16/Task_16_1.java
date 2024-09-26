package pl.roka.it.lesson16;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Задание 33.
 * Создать файл с текстом, прочитать, подсчитать в тексте количество знаков препинания и слов.
 */
public class Task_16_1 {
    public static void main(String[] args) {
        String text = "Two roads diverged in a yellow wood,\n" +
                "And sorry I could not travel both\n" +
                "And be one traveler, long I stood\n" +
                "And looked down one as far as I could\n" +
                "To where it bent in the undergrowth.";

        File file = new File("text1.txt");

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write(text);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        StringBuilder sb = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String str;
            while ((str = reader.readLine()) != null) {
                sb.append(str).append("\n");
            }
//            String[] numberOfWords = sb.toString().split("\\s+");
//            System.out.println("Количество слов в тексте: " + numberOfWords.length);
//
//            int signCounter = 0;
//            for (char c : sb.toString().toCharArray()) {
//                if (!Character.isWhitespace(c) && !Character.isLetterOrDigit(c)) {
//                    signCounter++;
//                }
//            }
//            System.out.println("Количество знаков препинания: " + signCounter);


            Pattern pattern = Pattern.compile("\\W+");
            Matcher matcher = pattern.matcher(sb);
            int wordsCounter = 0;
            while (matcher.find()) {
                wordsCounter++;
            }
            System.out.println("Количество слов в тексте: " + wordsCounter);

            pattern = Pattern.compile("\\pP");
            matcher = pattern.matcher(sb);
            int punctuationCounter = 0;
            while (matcher.find()) {
                punctuationCounter++;
            }
            System.out.println("Количество знаков препинания: " + punctuationCounter);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}