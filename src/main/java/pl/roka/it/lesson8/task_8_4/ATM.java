package pl.roka.it.lesson8.task_8_4;

/**
 * Создать класс и объекты описывающие Банкомат. Набор купюр находящихся в
 * банкомате должен задаваться тремя свойствами: количеством купюр номиналом 20
 * 50 100. Сделать методы для добавления денег в банкомат. Сделать функцию
 * снимающую деньги. На вход передается сумма денег. На выход – булевское
 * значение (операция удалась или нет). При снятии денег функция должна
 * рапечатывать каким количеством купюр какого номинала выдается сумма. Создать
 * конструктор с тремя параметрами – количеством купюр.
 */
public class ATM {
    private int hundred;
    private int fifty;
    private int twenty;

    public ATM(int hundred, int fifty, int twenty) {
        this.hundred = hundred;
        this.fifty = fifty;
        this.twenty = twenty;
    }

    public void addMoney(int hundred, int fifty, int twenty) {
        this.hundred += hundred;
        this.fifty += fifty;
        this.twenty += twenty;
    }

    public boolean withdrawMoney(int amongOfMoney) {
        int result = amongOfMoney;

        int returnedHundreds = Math.min(result / 100, hundred);
        result -= returnedHundreds * 100;
        int returnedFifties = Math.min(result / 50, fifty);
        result -= returnedFifties * 50;
        int returnedTwenties = Math.min(result / 20, twenty);
        result -= returnedTwenties * 20;


        if (result > 0) {
            hundred -= returnedHundreds;
            fifty -= returnedFifties;
            twenty -= returnedTwenties;

            System.out.println("hundred-dollar bills = " + returnedHundreds + "\n" +
                    "fifty-dollar bills " + returnedFifties + "\n" +
                    "twenty-dollar bills " + returnedTwenties);

            return true;

        } else {
            System.out.println("Some Things Are Wrong");
            return false;
        }

    }

    @Override
    public String toString() {
        return "ATM{" +
                "hundred=" + hundred +
                ", fifty=" + fifty +
                ", twenty=" + twenty +
                '}';
    }

    public static void main(String[] args) {
        ATM atm = new ATM(22, 17, 24);
        System.out.println(atm);
        atm.addMoney(8,13, 6);
        System.out.println(atm);
        atm.withdrawMoney(222);
        System.out.println(atm);
        atm.withdrawMoney(220);
        System.out.println(atm);
    }


}
