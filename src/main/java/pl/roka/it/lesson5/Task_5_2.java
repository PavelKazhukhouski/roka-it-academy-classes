package pl.roka.it.lesson5;

/**
 * Имеется строка с текстом. Подсчитать количество слов в тексте. Желательно
 * учесть, что слова могут разделяться несколькими пробелами, в начале и конце
 * текста также могут быть пробелы, но могут и отсутствовать.
 */

public class Task_5_2 {

    public static void main(String[] args) {
        String inputString = "    There is a    line with    text. Count the number of words in the text. Preferably" +
                "take into account that words can be separated by several spaces at the beginning and end" +
                " the text may also have spaces, but may also be absent.";

        String[] words = inputString.trim().split("\\s+");
        for (String word : words) {
            System.out.println(word);
        }


    }


}
