package pl.roka.it.lesson8.task_8_8;

public abstract class GroundTransport extends Transport {
    private int wheels;
    private double fuelConsumptionPer100km;

    public double getFuelConsumptionPer100km() {
        return fuelConsumptionPer100km;
    }

    @Override
    public String showInfo() {
        return "GroundTransport{" +
                "wheels=" + wheels +
                ", fuelConsumptionPer100km=" + fuelConsumptionPer100km +
                super.showInfo() +
                '}';
    }
}