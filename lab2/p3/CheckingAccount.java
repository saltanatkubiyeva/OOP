package p3;

public class CheckingAccount extends Account{
    private int transactionCount;
    private static final int FREE_TRANSACTIONS = 3;
    private static final double TRANSACTION_FEE = 0.02;

    public CheckingAccount(int a) {
        super(a);
        transactionCount = 0;
    }

    @Override
    public void deposit(double sum) {
        if (sum > 0) {
            super.deposit(sum);
            transactionCount++;
        } else {
            super.deposit(sum);
        }
    }

    @Override
    public void withdraw(double sum) {
        if (sum > 0 && sum <= getBalance()) {
            super.withdraw(sum);
            transactionCount++;
        } else {
            super.withdraw(sum);
        }
    }

    public void deductFee() {
        if (transactionCount > FREE_TRANSACTIONS) {
        int extraTransactions = transactionCount - FREE_TRANSACTIONS;
        double totalFee = extraTransactions * TRANSACTION_FEE;

        super.withdraw(totalFee);
        System.out.println("$" + totalFee + " commission charged from account №" + getAccNumber()  +" for " +  extraTransactions + " additional transaction(s).");
        }
    }

    @Override
    public String toString() {
        return(super.toString() + " | Transaction Fee: $" + TRANSACTION_FEE);
    }
}
