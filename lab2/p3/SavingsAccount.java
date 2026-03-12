package p3;

public class SavingsAccount extends Account{
    private double interestRate;

    public double getInterestRate() {
        return interestRate;
    }

    public SavingsAccount(int a, double rate) {
        super(a);
        this.interestRate = rate;
    }

    public void addInterest() {
        double interest = getBalance() * interestRate;
        deposit(interest);
        System.out.println( "$" + interest + " interest added for account №" + getAccNumber());
    }
    @Override
    public String toString() {
        return super.toString() + " | Interest Rate: " + (interestRate * 100) + "%";
    }
}
