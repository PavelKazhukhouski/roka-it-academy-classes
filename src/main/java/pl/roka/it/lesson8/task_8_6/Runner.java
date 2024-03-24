package pl.roka.it.lesson8.task_8_6;

public class Runner {
    public static void main(String[] args) {
        CreditCard cc = new CreditCard(2517, "Valera",3000.00,
                "12.06.2024", 1234, 2000.00);
        DebitCard dc = new DebitCard(9876, "Valera",4000.00,
                "13.06.2024", 6543, "Valera");

        System.out.println(cc.showInfo());
        System.out.println(dc.showInfo());

    }

}
