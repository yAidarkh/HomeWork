package Homework;

public class SavingAccount extends Account {


    @Override
    public void pay(int amount) {
        System.out.println("Невозможно оплатить так как счет Сберегательный.");
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




    public SavingAccount(int balance) {
        this.balance = balance;
    }
}
