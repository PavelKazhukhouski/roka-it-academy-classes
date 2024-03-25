package pl.roka.it.lesson8.task_8_8;
/**
 * Для легкового разработать метод, который будет принимать время и считать сколько
 * километров проедет машина двигаясь с максимальной скоростью и сколько топлива она
 * израсходует за это время, результат вывести в консоль, расчёт расходуемого топлива
 * вынести в отдельный метод private.
 */
public class GroundPassengerTransport extends GroundTransport {
    private String bodyType;
    private int passengers;


    public void calculationOfDistanceInTime(double hours) {
        double distance = hours * getMaxSpeed();

        System.out.println("За время " + hours +
                " часа, автомобиль " + getBrand() +
                " двигаясь с максимальной скоростью " + getMaxSpeed() +
                " км/ч израсходует " + this.calculateFuelConsumption(distance) +
                " литров топлива");

    }

    private double calculateFuelConsumption(double km) {
        return (getFuelConsumptionPer100km() / 100) * km;
    }

    @Override
    public String showInfo() {
        return "GroundPassengerTransport{" +
                "bodyType='" + bodyType + '\'' +
                ", passengers=" + passengers +
                super.showInfo() +
                '}';
    }
}