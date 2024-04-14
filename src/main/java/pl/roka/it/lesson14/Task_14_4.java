package pl.roka.it.lesson14;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

/**
 * Имеется текст. Следует составить для него частотный словарь.
 */
public class Task_14_4 {
    public static void main(String[] args) {
        String text = "Данный вариант итератора будет работать практически с любыми\n" +
                "коллекциями. Для коллекций типа список, таких как ArrayList или LinkedList\n" +
                "существует специальный итератор ListIterator. Для его получения данные коллекции\n" +
                "используют метод listIterator. Данный вариант итератора обладает значительно\n" +
                "более широкими возможностями, и соответственно большим количеством методов:";

        String[] words = text.toLowerCase().trim().replaceAll("\\pP", "").split("\\s+");
        System.out.println(Arrays.toString(words));
        Map<String, Integer> dictionary = new TreeMap<>();

        for (String word : words) {
            if (!dictionary.containsKey(word)) {
                dictionary.put(word, 1);
            } else {
                dictionary.put(word, dictionary.get(word) + 1);
            }
        }
//        for (Map.Entry<String,Integer> entry : dictionary.entrySet()) {
//            System.out.println(entry);
//        }
        for (String s : dictionary.keySet()) {
            System.out.println("Текст содержит слово \"" + s + "\" в количестве " + dictionary.get(s));
        }
    }
}
