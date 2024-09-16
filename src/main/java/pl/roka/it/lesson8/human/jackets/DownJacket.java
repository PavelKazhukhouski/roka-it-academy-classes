package pl.roka.it.lesson8.human.jackets;

public class DownJacket implements Jacket{
    private String material;
    private int price;

    @Override
    public void putOn() {
        System.out.println("Надел пуховик.");
    }

    @Override
    public void takeOff() {
        System.out.println("Снял пуховик.");
    }
}
