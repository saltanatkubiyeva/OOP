package p3;

import java.util.Vector;

public class Bank {
    private Vector<Account> accounts;

    public Bank() {
        accounts = new Vector<>();
    }

    public void openAccount(Account acc) {
        accounts.add(acc);
        System.out.println("Account №" + acc.getAccNumber() + "is created.");
    }

    public void closeAccount(int accNumber) {
        for (Account acc:accounts) {
            if(acc.getAccNumber() == accNumber) {
                accounts.removeIf(a -> a.getAccNumber() == accNumber);
                System.out.println("Account №" + accNumber + " was deleted.");
                return;
            }
        }
        System.out.println("Account №" + accNumber + " not found.");
    }


    public void update() {
        for(Account acc:accounts) {
            if (acc instanceof SavingsAccount) {
                SavingsAccount sa = (SavingsAccount) acc;
                sa.addInterest();
            } else if (acc instanceof CheckingAccount) {
                CheckingAccount ca = (CheckingAccount) acc;
                ca.deductFee();
            }
        }
    }

    public void displayAccounts() {
        System.out.println("\n==== ALL ACCOUNTS ===");
        for(Account acc:accounts) {
            acc.print();
        }
        System.out.println("\n");
    }
    }
