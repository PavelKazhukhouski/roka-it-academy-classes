package pl.roka.it.lesson8.human;

import pl.roka.it.lesson8.human.jackets.Jacket;
import pl.roka.it.lesson8.human.shoes.Shoes;
import pl.roka.it.lesson8.human.trousers.Trousers;

/**
 * 2) По аналогии с первым задание делаем след.
 * Интерфейсы:
 * - Куртка
 * - Штаны
 * - Обувь
 * в каждом интерфейсе есть 2 метода (надеть и снять)
 * Делаем несколько реализации каждого интерфейса.
 *
 * Создаём класс человек:
 * У человека поля:
 * - имя
 * - куртка
 * - штаны
 * - обувь
 * У человека есть 2 метода:
 * - одеться(вызываются методы надеть у всех вещей)
 * - раздеться (вызываются методы снять у всех вещей)
 */
public class Human {
    private String name;
    Jacket jacket;
    Trousers trousers;
    Shoes shoes;

    public void dress() {
        jacket.putOn();
        trousers.putOn();
        shoes.putOn();
    }

    public void undress() {
        jacket.takeOff();
        trousers.takeOff();
        shoes.takeOff();
    }

}
