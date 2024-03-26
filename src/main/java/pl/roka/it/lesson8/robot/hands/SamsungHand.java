package pl.roka.it.lesson8.robot.hands;

public class SamsungHand implements IHand{
    private int price;

    public SamsungHand(int price){
        this.price = price;
    }

    public SamsungHand(){
    }

    @Override
    public void upHand() {
        System.out.println("Samsung поднял руку");
    }

    @Override
    public int getPrice() {
        return this.price;
    }
}
