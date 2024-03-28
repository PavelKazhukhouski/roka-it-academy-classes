package pl.roka.it.lesson8.spaceport;

import pl.roka.it.lesson8.spaceport.spaceships.Apollo;
import pl.roka.it.lesson8.spaceport.spaceships.Shuttle;
import pl.roka.it.lesson8.spaceport.spaceships.Soyuz;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        Spaceport spaceport = new Spaceport();

        Apollo apollo = new Apollo();
        Shuttle shuttle = new Shuttle();
        Soyuz soyuz = new Soyuz();

        List<IStart> spaceShips = Arrays.asList(new IStart[]{new Apollo(), new Soyuz(), new Shuttle()});

        for (IStart ship : spaceShips) {
            spaceport.launch(ship);
        }

    }

}
