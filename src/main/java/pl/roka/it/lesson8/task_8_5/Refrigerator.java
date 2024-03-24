package pl.roka.it.lesson8.task_8_5;

public class Refrigerator extends KitchenAppliances {
    private int temperature;

    public Refrigerator(String brand, String model) {
        super(brand, model);
    }



    public void setTemperature(int temperature) {
        this.temperature = temperature;
        System.out.println("temperature_in " + getBrand() + " " + getModel() + " = " + temperature + " degree.");
    }

    public int getTemperature() {
        return temperature;
    }


}
