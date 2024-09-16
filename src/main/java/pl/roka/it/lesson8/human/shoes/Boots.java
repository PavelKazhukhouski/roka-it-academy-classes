package pl.roka.it.lesson8.human.shoes;

public class Boots implements Shoes{
    private String material;
    private int price;

    @Override
    public void putOn() {
        System.out.println("Надел Ботинки.");
    }

    @Override
    public void takeOff() {
        System.out.println("Снял Ботинки.");
    }
}
