package pl.roka.it.lesson8.task_8_6;
/**
 * Создать иерархию классов, описывающих банковские карточки.
 * Иерархия должна иметь хотя бы три уровня.
 */

public abstract class BankCard implements PaymentСard {
    private int cardNumber;
    private String cardHolderName;
    private double balance;
    private String expirationDate;

    private int pinCode;

    public BankCard(int cardNumber, String cardHolderName, double balance, String expirationDate, int pinCode) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.balance = balance;
        this.expirationDate = expirationDate;
        this.pinCode = pinCode;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance -= balance;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getPinCode() {
        return "****";
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void checkBalance() {
        System.out.println(balance);
    }

}




