package Homework;

public class CreditAccount extends Account {
    private int balance;

    @Override
    public void pay(int amount) {
        this.balance -= amount;
        System.out.printf("Успешно оплачено. Остаток на балансе: %d \n", this.getBalance());

    }

    @Override
    public void transfer(Account account, int amount) {
        if (balance > amount) {
            this.balance -= amount;
            account.setBalance(account.getBalance() + amount);
            System.out.printf("Успешно переведено. Остаток на балансе: %d \n", this.getBalance());
        } else {
            System.out.println("Недостаточно средтсв.");
        }
    }

    @Override
    public void addMoney(int amount) {
        this.setBalance(this.getBalance() + amount);
        System.out.printf("Успешно пополнено. Ваш баланс: %d \n", this.getBalance());
    }

    @Override
    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public CreditAccount(int balance1) {
        this.balance = balance1;
    }
}
