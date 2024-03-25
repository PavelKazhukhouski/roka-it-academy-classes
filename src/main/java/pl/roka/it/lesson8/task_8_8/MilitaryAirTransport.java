package pl.roka.it.lesson8.task_8_8;
/**
 * Для Военных самолётов делаем метод выстрел, проверяем если кол-во ракет не равно 0 то выводим
 * на консоль “ Ракета пошла…”, если 0 то
 * “Боеприпасы отсутствуют”.
 * А так же метод катапультирование, который проверит если наличие системы катапультирования true,
 * то выводим “Катапультирование прошло успешно”, если false, то “У вас нет такой системы ”
 */
public class MilitaryAirTransport extends AirTransport {
    private boolean ejectionSystem;
    private int rockets;

    public void cargoLoading(int rockets){
        if(this.rockets < rockets) {
            System.out.println("Боеприпасы отсутствуют");
        }else {
            this.rockets -= rockets;
            System.out.println("Ракета пошла…");
        }
    }

    public void ejection() {
        if (ejectionSystem) {
            ejectionSystem = !ejectionSystem;
            System.out.println("Катапультирование прошло успешно");
        } else {
            System.out.println("У вас нет такой системы");
        }
    }

    @Override
    public String showInfo() {
        return "MilitaryAirTransport{" +
                "ejectionSystem=" + ejectionSystem +
                ", rockets=" + rockets +
                super.showInfo() +
                '}';
    }
}
