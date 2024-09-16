package pl.roka.it.lesson8.task_8_6;
/**
 * Создать иерархию классов, описывающих банковские карточки.
 * Иерархия должна иметь хотя бы три уровня.
 */
public interface PaymentСard {
    void withDrawMoney(double amount);

    void deposit(double amount);

    void checkBalance();

    public String showInfo();

}
