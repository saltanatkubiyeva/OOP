import java.util.Scanner;

public class GradeSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter score (from 0 to 100): ");
        int score = sc.nextInt();

        if (score >= 95) {
            System.out.println("A");
        } else if (score >= 90) {
            System.out.println("A-");
        } else if (score >= 85) {
            System.out.println("B+");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 75) {
            System.out.println("B-");
        } else if (score >= 70) {
            System.out.println("C+");
        } else if (score >= 65) {
            System.out.println("C");
        } else if (score >= 60) {
            System.out.println("C-");
        } else {
            System.out.println("F");
        }

        sc.close();
    }
}
