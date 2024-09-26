package pl.roka.it.lesson8.task_8_8;
/**
 * Такой же метод делаем для Гражданских  самолётов, только проверяем вместимость пассажиров.
 */
public class CivilAirTransport extends AirTransport {
    private int numberPassengers;
    private boolean businessClass;

    public void passengersLoading(int passengers){
        if(numberPassengers < passengers) {
            System.out.println("Вам нужен самолет побольше");
        }else {
            numberPassengers -= passengers;
            System.out.println("Самолет загружен");
        }
    }

    @Override
    public String showInfo() {
        return "CivilAirTransport{" +
                "numberPassengers=" + numberPassengers +
                ", businessClass=" + businessClass +
                super.showInfo() +
                '}';
    }
}
