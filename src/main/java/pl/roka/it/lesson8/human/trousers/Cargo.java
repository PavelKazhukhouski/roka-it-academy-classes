package pl.roka.it.lesson8.human.trousers;

public class Cargo implements Trousers{
    private String material;
    private int price;

    @Override
    public void putOn() {
        System.out.println("Надел брюки карго.");
    }

    @Override
    public void takeOff() {
        System.out.println("Снял брюки карго.");
    }
}
