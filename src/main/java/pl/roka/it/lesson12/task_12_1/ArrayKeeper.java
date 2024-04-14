package pl.roka.it.lesson12.task_12_1;

import java.util.Arrays;

/**
 * Написать класс, который умеет хранить в себе массив любых типов данных (int, long
 * etc.). Реализовать метод get(int index), который возвращает любой элемент
 * массива по индексу.
 *
 * @param <T>
 */
public class ArrayKeeper<T> {
    private final T[] array;

    public ArrayKeeper(T[] array) {
        this.array = array;
    }

    public ArrayKeeper(int length) {
        array = (T[]) new Object[length];
    }

    public T getValue(int index) {
        return array[index];
    }

    public void setValue(int index, T value) {
        if(index < array.length) {
            array[index] = value;
        }else {
            System.out.println("Index is wrong");

        }
    }

    @Override
    public String toString() {
        return "ArrayKeeper{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}
