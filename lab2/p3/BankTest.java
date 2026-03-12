package p3;

public class BankTest {
    public static void main(String[] args) {
        Bank myBank = new Bank();

        SavingsAccount acc1 = new SavingsAccount(1, 0.05);
        SavingsAccount acc2 = new SavingsAccount(2, 0.04);
        CheckingAccount acc3 = new CheckingAccount(3);

        myBank.openAccount(acc1);
        myBank.openAccount(acc2);
        myBank.openAccount(acc3);

        acc1.deposit(1000); // (01)balance: 1000
        acc2.deposit(1000); // (02)balance: 1000
        acc3.deposit(1000); // (03)balance: 1000

        myBank.displayAccounts();

        acc1.withdraw(500.00); // (01)balance: 500

        acc3.withdraw(800.00);
        acc3.deposit(2400.00);
        acc3.withdraw(500.00); // 4th transaction (fee!)

        myBank.update();
        myBank.displayAccounts();

    }


}
