package pl.roka.it.lesson8.human.shoes;

public class Sneakers implements Shoes{
    private String material;
    private int price;

    @Override
    public void putOn() {
        System.out.println("Надел кроссовки.");
    }

    @Override
    public void takeOff() {
        System.out.println("Снял кроссовки.");
    }
}
