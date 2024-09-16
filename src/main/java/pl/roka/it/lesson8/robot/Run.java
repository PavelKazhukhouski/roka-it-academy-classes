package pl.roka.it.lesson8.robot;

import pl.roka.it.lesson8.robot.hands.SamsungHand;
import pl.roka.it.lesson8.robot.hands.ToshibaHand;
import pl.roka.it.lesson8.robot.heads.SamsungHead;
import pl.roka.it.lesson8.robot.heads.SonyHead;
import pl.roka.it.lesson8.robot.heads.ToshibaHead;
import pl.roka.it.lesson8.robot.legs.SamsungLeg;
import pl.roka.it.lesson8.robot.legs.SonyLeg;
import pl.roka.it.lesson8.robot.legs.ToshibaLeg;

import java.util.ArrayList;
import java.util.List;

public class Run {
    public static void main(String[] args) {
        /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */

        Robot first = new Robot(new ToshibaHead(122), new SamsungHand(335), new SonyLeg(890));
        Robot second = new Robot(new SonyHead(144), new ToshibaHand(222), new SamsungLeg(55));
        Robot thirds = new Robot(new SamsungHead(567), new SamsungHand(366), new ToshibaLeg(462));

        List<Robot> rbts = new ArrayList<>();

        rbts.add(first);
        rbts.add(second);
        rbts.add(thirds);

        int maxPrice = 0;

        for (Robot rbt : rbts) {
            rbt.action();
            if (maxPrice < rbt.getPrice()){
                maxPrice = rbt.getPrice();
            }
        }

        Robot theMostExpensiveRobot = null;

        for (Robot rbt : rbts) {
            if(rbt.getPrice() == maxPrice){
                theMostExpensiveRobot = rbt;
            }
        }

        if (theMostExpensiveRobot != null){
            System.out.println("Самый дорогой робот делает :");
            theMostExpensiveRobot.action();
        }


    }
}
