package Homework;

public class Main {
    public static void main(String[] args) {
        Account account1 = new SavingAccount(10000);
        Account account2 = new CreditAccount(2000);
        Account account3 = new CheckingAccount(30000);

        account1.pay(2000);
        account2.pay(3000);
        account3.pay(1000);

        System.out.println(account2.getBalance());
        account1.transfer(account2,3000);
        System.out.println(account2.getBalance());
        account1.addMoney(2000);

        System.out.println(account1.getBalance());
        account2.transfer(account1,3000);
        System.out.println(account1.getBalance());
        account2.addMoney(3000);

        System.out.println(account1.getBalance());
        account3.transfer(account1,1000);
        System.out.println(account1.getBalance());
        account3.addMoney(3000);
    }
}
