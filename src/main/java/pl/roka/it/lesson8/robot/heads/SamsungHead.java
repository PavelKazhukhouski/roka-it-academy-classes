package pl.roka.it.lesson8.robot.heads;

public class SamsungHead implements IHead{

    private int price;

    public SamsungHead(int price){
        this.price = price;
    }

    public SamsungHead(){
    }

    @Override
    public void speek() {
        System.out.println("Говорит голова Samsung");
    }

    @Override
    public int getPrice() {
        return this.price;
    }

}