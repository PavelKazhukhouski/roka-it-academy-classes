package pl.roka.it.lesson8.task_8_6;


public class CreditCard extends BankCard{
    private double creditLimit;

    public CreditCard(int cardNumber, String cardHolderName, double balance, String expirationDate, int pinCode, double creditLimit) {
        super(cardNumber, cardHolderName, balance, expirationDate, pinCode);
        this.creditLimit = creditLimit;
    }

    @Override
    public void withDrawMoney(double amount) {
        if (creditLimit <= amount && getBalance() <= amount){
            creditLimit -= amount;
            setBalance(amount);
        }
    }

    @Override
    public String showInfo() {
        return "Credit Card{" +
                "Card Number=" + getCardNumber() +
                ", Card Holder Name=" + getCardHolderName() +
                ", Balance=" + getBalance() +
                ", Expiration Date=" + getExpirationDate() +
                ", Pin Code=" + getPinCode() +
                ", Credit Limit=" + creditLimit +
                '}';
    }
}
