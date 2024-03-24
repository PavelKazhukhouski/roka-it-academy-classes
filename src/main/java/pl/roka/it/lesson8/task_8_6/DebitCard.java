package pl.roka.it.lesson8.task_8_6;


public class DebitCard extends BankCard {
    private String linkedAccount;

    public DebitCard(int cardNumber, String cardHolderName, double balance, String expirationDate, int pinCode, String linkedAccount) {
        super(cardNumber, cardHolderName, balance, expirationDate, pinCode);
        this.linkedAccount = linkedAccount;
    }

    public String getLinkedAccount() {
        return linkedAccount;
    }

    @Override
    public void withDrawMoney(double amount) {
        if (getBalance() >= amount);
        super.setBalance(amount);
    }

    public String showInfo() {
        return "Debit Card{" +
                "Card Number=" + getCardNumber() +
                ", Card Holder Name=" + getCardHolderName() +
                ", Balance=" + getBalance() +
                ", Expiration Date=" + getExpirationDate() +
                ", Pin Code=" + getPinCode() +
                ", Linked Account=" + linkedAccount +
                '}';
    }





}
