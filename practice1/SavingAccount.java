public class SavingAccount {
    public static void main(String[] args) {

        double balance = 52372.0;   
        double interestRate = 0.05; 

        double interest = balance * interestRate;
        double newBalance = balance + interest;

        System.out.println("Initial balance: " + balance);
        System.out.printf("Interest: %.1f%n", interest);
        System.out.println("New balance: " + newBalance);
    }
}
