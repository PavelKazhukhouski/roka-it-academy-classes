package pl.roka.it.lesson8.task_8_3;

/**
 * Создать класс и объекты описывающие промежуток времени. Сам промежуток
 * в классе должен задаваться тремя свойствами: секундами, минутами, часами.
 * Сделать методы для получения полного количества секунд в объекте, сравнения
 * двух объектов (метод должен работать аналогично compareTo в строках). Создать
 * два конструктора: получающий общее количество секунд, и часы, минуты и секунды
 * по отдельности. Сделать метод для вывода данных.
 */
public class TimeInterval {
    private int hours;
    private int minutes;
    private int seconds;

    public TimeInterval(int seconds) {
        this.seconds = seconds % 60;
        int m = (seconds - this.seconds) / 60;
        this.minutes = m % 60;
        this.hours = (m - this.minutes) / 60;
    }

    public TimeInterval(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int totalNumberOfSeconds() {
        Integer i = 2;
        Integer e = 3;
        int d = i.compareTo(e);
        return (hours * 60 + minutes) * 60 + seconds;
    }

    public int compareToTimeInterval(TimeInterval y) {
        return compare(this.totalNumberOfSeconds(), y.totalNumberOfSeconds());
    }

    private int compare(int x, int y) {
        return (x < y) ? -1 : ((x == y) ? 0 : 1);
    }

    public String showInformation() {
        return "TimeInterval - " +
                "hours=" + hours +
                ", minutes=" + minutes +
                ", seconds=" + seconds;
    }

    public static void main(String[] args) {
        TimeInterval first = new TimeInterval(5,45,55);
        TimeInterval second = new TimeInterval(20755);

        System.out.println(first.compareToTimeInterval(second));
        System.out.println(first.showInformation());
        System.out.println(second.showInformation());
    }

}
