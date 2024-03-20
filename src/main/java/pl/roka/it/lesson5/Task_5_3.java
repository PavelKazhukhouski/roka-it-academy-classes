package pl.roka.it.lesson5;

/**
 * Имеется строка с текстом. Вывести текст, составленный из последних букв
 * всех слов.
 */
public class Task_5_3 {
    public static void main(String[] args) {
        String inputString = "There is a line with text. Print text made up of the last letters"
                + " all words.";
        String[] words = inputString.trim().replaceAll("\\pP", "\\s").
                split("\\pP|\\s+");
        for (String word : words) {
            System.out.print(word.charAt(word.length() - 1));
        }


    }
}
