import java.util.Scanner;

public class StarTriangle {

    private int width;

    public StarTriangle(int width) {
        if (width <= 0) {
            throw new IllegalArgumentException("Width must be positive.");
        }
        this.width = width;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= width; i++) {
            for (int j = 1; j <= i; j++) {
                sb.append("[*]");
            }
            sb.append("\n");
        }

        return sb.toString();
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter triangle width: ");
        int width = scanner.nextInt();

        StarTriangle triangle = new StarTriangle(width);

        System.out.println("\nGenerated triangle:");
        System.out.println(triangle);

        scanner.close();
    }
}
