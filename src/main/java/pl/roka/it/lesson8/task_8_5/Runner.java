package pl.roka.it.lesson8.task_8_5;

public class Runner {
    public static void main(String[] args) {
        Refrigerator samsungFridge = new Refrigerator("Samsung", "RS54K47F02C");
        KitchenAppliances oven = new Refrigerator("Bosch", "HBF134BS0");

        samsungFridge.powerOn();
        oven.powerOn();
        oven.cook();
        samsungFridge.setTemperature(2);
        samsungFridge.powerOff();

    }
}
