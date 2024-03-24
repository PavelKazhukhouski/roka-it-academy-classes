package pl.roka.it.lesson8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Написать программу, выполняющую поиск в строке всех тегов абзацев, в т.ч. тех, у
 * которых есть параметры, например <p id=”p1”>, и замену их на простые теги
 * абзацев <p>.
 */
public class Task_8_2 {
    public static void main(String[] args) {
        String example = "which have parameters, for example <p id=”p1”>, and replacing them with simple tags";

        Pattern pattern = Pattern.compile("<p\\s+([^>]*)>");
        Matcher matcher = pattern.matcher(example);

        String result = matcher.replaceAll("<p>");

        System.out.println(result);




    }
}
