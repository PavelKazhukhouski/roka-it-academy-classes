package pl.roka.it.lesson8.task_8_8;
/**
 * Для грузового разработать метод, который проверит можно ли загрузить в него xxx  груза.
 * Метод должен проверять если это кол-во груза помещается в грузовик то выводит в консоль
 * ”Грузовик загружен”, если кол-во груза которое нужно загрузить больше чем то которое может
 * влезть в наш грузовик то выводим
 *  “Вам нужен грузовик побольше ”.
 */
public class FreightTransport extends GroundTransport {
    private double cargoCapacity;

    public void cargoLoading(double capacity){
        if(cargoCapacity < capacity) {
            System.out.println("Вам нужен грузовик побольше");
        }else {
            cargoCapacity -= capacity;
            System.out.println("Грузовик загружен");
        }
    }

    @Override
    public String showInfo() {
        return "FreightTransport{" +
                "cargoCapacity=" + cargoCapacity +
                super.showInfo() +
                '}';
    }
}
