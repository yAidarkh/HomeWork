package Homework;

public abstract class Account {
    protected int balance;

    public abstract void pay(int amount);

    public abstract void transfer(Account account, int amount);

    public abstract void addMoney(int amount);

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public  int getBalance() {
        return balance;
    }

}
