package pl.roka.it.lesson8.human.jackets;

public class Bomber implements Jacket{
    private String material;
    private int price;

    @Override
    public void putOn() {
        System.out.println("Надел бомбер.");
    }

    @Override
    public void takeOff() {
        System.out.println("Снял бомбер.");
    }
}
