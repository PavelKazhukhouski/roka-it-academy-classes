package pl.roka.it.lesson8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Написать программу, выполняющую поиск в строке шестнадцатеричных чисел,
 * записаных по правилам Java, с помощью регулярных выражений и вывести их на
 * страницу.
 */
public class Task_8_1 {
    public static void main(String[] args) {
        String example = "Write a 0xFFF program that searches 0x000 a string of hexadecimal numbers.";

        Pattern pattern = Pattern.compile("\\b0[xX][0-9a-fA-F]+\\b");
        Matcher matcher = pattern.matcher(example);

        while (matcher.find()){
            System.out.println(matcher.group() + " " + matcher.start() + " "+ matcher.end());
        }
    }

}
