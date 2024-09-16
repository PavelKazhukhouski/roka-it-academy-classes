package pl.roka.it.lesson8.spaceport.spaceships;

import pl.roka.it.lesson8.spaceport.IStart;

import java.time.LocalTime;

public class Soyuz implements IStart {
    @Override
    public boolean preLaunchSystemCheck() {
        LocalTime currentTime = LocalTime.now();
        int currentHour = currentTime.getHour();
        int dayStart = 6;
        int dayEnd = 22;
        boolean isDay = currentHour >= dayStart && currentHour <= dayEnd;

        return isDay;
    }

    @Override
    public void startingEngines() {
        System.out.println("Двигатели \"Союз-19\" запущены. Все системы в норме.");
    }

    @Override
    public void start() {
        System.out.println("Старт \"Союз-19\".");
    }
}
