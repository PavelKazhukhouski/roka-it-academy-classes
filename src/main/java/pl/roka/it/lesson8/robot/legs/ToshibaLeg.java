package pl.roka.it.lesson8.robot.legs;

public class ToshibaLeg implements ILeg{
    private int price;

    public ToshibaLeg(int price){
        this.price = price;
    }

    public ToshibaLeg(){
    }

    @Override
    public void step() {
        System.out.println("Toshiba сделал шаг");
    }

    @Override
    public int getPrice() {
        return this.price;
    }
}
