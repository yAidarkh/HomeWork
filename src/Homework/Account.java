package Homework;

public abstract class Account {
    private int balance;

    public void pay(int amount) {
    }

    public void transfer(Account account, int amount) {
    }

    public void addMoney(int amount) {
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

}
