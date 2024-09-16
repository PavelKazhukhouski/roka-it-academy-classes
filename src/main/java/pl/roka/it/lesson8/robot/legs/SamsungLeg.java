package pl.roka.it.lesson8.robot.legs;

public class SamsungLeg implements ILeg{
    private int price;

    public SamsungLeg(int price){
        this.price = price;
    }

    public SamsungLeg(){
    }

    @Override
    public void step() {
        System.out.println("Samsung сделал шаг");
    }

    @Override
    public int getPrice() {
        return this.price;
    }
}
