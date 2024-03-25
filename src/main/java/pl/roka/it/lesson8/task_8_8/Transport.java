package pl.roka.it.lesson8.task_8_8;

public abstract class Transport {
    private int horsepower;
    private int maxSpeed;
    private int weight;
    private String brand;


    public double kilowattCalculation(int horsepower) {
        return horsepower * 0.74;
    }

    public String showInfo() {
        return "Transport{" +
                "horsepower=" + horsepower +
                ", maxSpeed=" + maxSpeed +
                ", weight=" + weight +
                ", brand='" + brand + '\'' +
                ", kilowatt=" + kilowattCalculation(horsepower) +
                '}';
    }

    public int getHorsepower() {
        return horsepower;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getWeight() {
        return weight;
    }

    public String getBrand() {
        return brand;
    }


}
