package pl.roka.it.lesson12.task_12_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Runner {
    public static void main(String[] args) {
        ArrayKeeper <Integer> keeper = new ArrayKeeper<>(new Integer[]{12,22,37,54,33});
        System.out.println(keeper.getValue(3));

        ArrayKeeper <String> stringArrayKeeper = new ArrayKeeper<>(3);
        stringArrayKeeper.setValue(0, "Valera");
        stringArrayKeeper.setValue(1, "Masha");
        stringArrayKeeper.setValue(2, "Sweta");

        System.out.println(stringArrayKeeper.toString());




    }
}
