package pl.roka.it.lesson8.spaceport;

/**
 * Создаем интерфейс IStart.
 * В интерфейсе определяем методы:
 * • предстартовая проверка систем(возвращает true/false)
 * • запуск двигателей(void)
 * • старт(void)
 */
public interface IStart {
    boolean preLaunchSystemCheck();

    void startingEngines();

    void start();
}
