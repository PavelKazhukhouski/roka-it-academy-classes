package pl.roka.it.lesson5;

/**
 * Напишите три цикла выполняющих многократное сложение строк, один с
 * помощью оператора сложения и String, другой с помощью StringBuilder и метода
 * append, а также аналогино для StringBuffer. Сравните скорость их выполнения.
 */
public class Task_5_4 {
    public static void main(String[] args) {
        String str = "Hello ";
        double startOfFirstCycle = System.nanoTime();
        for (int i = 0; i < 10; i++) {
            str += "Hello ";
        }
        double endOfFirstCycle = System.nanoTime();
        System.out.println(str);
        System.out.println("String Loop Running Time - " + (endOfFirstCycle - startOfFirstCycle));


        StringBuilder sb = new StringBuilder("Hello ");
        double startOfSecondCycle = System.nanoTime();
        for (int i = 0; i < 10; i++) {
            sb.append("Hello ");
        }
        double endOfSecondCycle = System.nanoTime();
        System.out.println("StringBuilder Loop Running Time - " + (endOfSecondCycle - startOfSecondCycle));


        StringBuffer sBuf = new StringBuffer("Hello ");
        double startOfThirdCycle = System.nanoTime();
        for (int i = 0; i < 10; i++) {
            sBuf.append("Hello ");
        }
        double endOfThirdCycle = System.nanoTime();
        System.out.println("StringBuffer Loop Running Time - " + (endOfThirdCycle - startOfThirdCycle));


    }
}
