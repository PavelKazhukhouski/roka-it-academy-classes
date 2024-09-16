package pl.roka.it.lesson8.spaceport.spaceships;

import pl.roka.it.lesson8.spaceport.IStart;

import java.util.Random;

/**
 * Шатл реализует интерфейс IStart.
 * • В методе предстартовой проверки генерируем случайное число в диапазоне от 0 до 10.
 * Если сгенерированное число больше 3-х то проверка прошла успешно. Если нет не успешно.
 * • В методе запуска двигателей выводим строку в консоль «Двигатели Шатла запущены. Все системы в норме.»
 * • В методе старт выводим строку в консоль. «Старт Шатла»
 * По аналогии создайте еще пару классов реализующих интерфейс Istart(например SpaceX).
 * Для предстартовой проверки можете придумать свою логику, главное, что бы метод возвращал true либо false
 * в зависимости от того прошла ли она успешно.
 * Запустите в космос созданные вами космические корабли используя созданный вами космодром и его метод старт.
 */
public class Shuttle implements IStart {
    @Override
    public boolean preLaunchSystemCheck() {
        int random = new Random().nextInt(11);

        return random > 3;
    }

    @Override
    public void startingEngines() {
        System.out.println("Двигатели \"Space Shuttle\" запущены. Все системы в норме.");
    }

    @Override
    public void start() {
        System.out.println("Старт \"Space Shuttle\".");
    }
}
