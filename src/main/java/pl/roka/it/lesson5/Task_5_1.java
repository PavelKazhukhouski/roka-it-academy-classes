package pl.roka.it.lesson5;

/**
 * Найти в строке не только запятые, но и другие знаки препинания. Подсчитать
 * общее их количество.
 */

public class Task_5_1 {
    public static void main(String[] args) {
        String str = "Find not only commas - but also other ! punctuation marks " +
                "in the string. Count the ? total number of punctuation marks.";
        int counter = 0;

        for (int i = 0; i < str.length(); i++) {

            if (String.valueOf(str.charAt(i)).matches("\\pP")) {
                System.out.println(str.charAt(i));
                counter++;
            }

        }
        System.out.println("We have " + counter + " punctuation marks.");
    }
}