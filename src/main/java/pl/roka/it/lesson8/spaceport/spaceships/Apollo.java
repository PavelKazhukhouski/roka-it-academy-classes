package pl.roka.it.lesson8.spaceport.spaceships;

import pl.roka.it.lesson8.spaceport.IStart;

import java.time.LocalTime;

public class Apollo implements IStart {
    @Override
    public boolean preLaunchSystemCheck() {
        LocalTime currentTime = LocalTime.now();
        int currentHour = currentTime.getHour();
        int nightStart = 23;
        int nightEnd = 6;
        boolean isNight = currentHour >= nightStart || currentHour <= nightEnd;

        return isNight;
    }

    @Override
    public void startingEngines() {
        System.out.println("Двигатели \"Apollo\" запущены. Все системы в норме.");
    }

    @Override
    public void start() {
        System.out.println("Старт \"Apollo\".");
    }
}
