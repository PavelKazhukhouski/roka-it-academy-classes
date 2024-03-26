package pl.roka.it.lesson8.robot.hands;

public class ToshibaHand implements IHand{
    private int price;

    public ToshibaHand(int price){
        this.price = price;
    }

    public ToshibaHand(){
    }

    @Override
    public void upHand() {
        System.out.println("Toshiba поднял руку");
    }

    @Override
    public int getPrice() {
        return this.price;
    }
}
