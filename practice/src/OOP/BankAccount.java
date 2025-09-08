package OOP;

public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public double withdraw(double amount) {
        if (balance - amount > 0) {
            balance -= amount;

            return amount;
        }
        System.out.printf("Insufficient funds to withdraw %f from account with balance of %f", amount, balance);
        return 0;
    }
}
