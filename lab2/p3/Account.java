package p3;

public class Account {
    private double balance;
    private int accNumber;

    public Account(int a) {
        balance = 0.0;
        accNumber = a;
    }

    public double getBalance() {
        return balance;
    }

    public int getAccNumber() {
        return accNumber;
    }

    public void deposit(double sum) {
        if (sum > 0) {
            balance += sum;
        } else {
            System.err.println("Failed! Invalid amount!");
        }
    }

    public void withdraw(double sum) {
        if (sum > 0 && sum <= balance) {
            balance -= sum;
        } else {
            System.err.println("Failed! Insufficient funds!");
        }
    }

    public void transfer(double amount, Account other) {
        if(amount > 0 && amount <= balance) {
            this.withdraw(amount);
            other.deposit(amount);
        } else {
            System.err.println("Transaction failed! Invalid sum or insufficient funds!");
        }
    }

    @Override
    public String toString() {
        return "Acc No: " + accNumber + " | Balance: $" + balance;
    }

    public final void print() {
        System.out.println(toString());
    }
}
