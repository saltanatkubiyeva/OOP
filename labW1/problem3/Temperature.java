import java.util.Scanner;

public class Temperature {

    private double value;
    private char scale;

    // Constructor 1: default - zero Celsius
    public Temperature() {
        this.value = 0.0;
        this.scale = 'C';
    }

    // Constructor 2: value only (Celsius by default)
    public Temperature(double value) {
        this.value = value;
        this.scale = 'C';
    }

    // Constructor 3: scale only (zero degrees)
    public Temperature(char scale) {
        this.value = 0.0;
        setScale(scale);
    }

    // Constructor 4: both value and scale
    public Temperature(double value, char scale) {
        this.value = value;
        setScale(scale);
    }

    // Accessor: return degrees in Celsius
    public double getInCelsius() {
        if (scale == 'C') {
            return value;
        } else {
            return 5.0 * (value - 32) / 9.0;
        }
    }

    // Accessor: return degrees in Fahrenheit
    public double getInFahrenheit() {
        if (scale == 'F') {
            return value;
        } else {
            return (9.0 * value / 5.0) + 32;
        }
    }

    // Accessor: return scale
    public char getScale() {
        return scale;
    }

    // Mutator: set value
    public void setValue(double value) {
        this.value = value;
    }

    // Mutator: set scale
    public void setScale(char scale) {
        if (scale == 'C' || scale == 'F') {
            this.scale = scale;
        } else {
            System.out.println("Invalid scale. Use 'C' or 'F'. Defaulting to Celsius.");
            this.scale = 'C';
        }
    }

    // Mutator: set both value and scale
    public void set(double value, char scale) {
        setValue(value);
        setScale(scale);
    }

    @Override
    public String toString() {
        return value + "°" + scale;
    }

    // Helper: read a valid double from user
    private static double readDouble(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine().trim();
            try {
                return Double.parseDouble(input);
            } catch (NumberFormatException e) {
                System.out.println("  Invalid input. Please enter a numeric value (e.g. 100 or -5.5).");
            }
        }
    }

    // Helper: read a valid scale ('C' or 'F') from user
    private static char readScale(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine().trim().toUpperCase();
            if (input.equals("C") || input.equals("F")) {
                return input.charAt(0);
            } else {
                System.out.println("  Invalid scale. Please enter 'C' for Celsius or 'F' for Fahrenheit.");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Temperature Converter ===");
        System.out.println();

        // Get value and scale from user
        double value = readDouble(scanner, "Enter temperature value: ");
        char scale = readScale(scanner, "Enter scale (C/F): ");

        Temperature temp = new Temperature(value, scale);

        System.out.println();
        System.out.println("Temperature entered : " + temp);
        System.out.printf("In Celsius          : %.2f°C%n", temp.getInCelsius());
        System.out.printf("In Fahrenheit       : %.2f°F%n", temp.getInFahrenheit());

        // Ask if user wants to update
        System.out.println();
        System.out.print("Do you want to update the temperature? (yes/no): ");
        String answer = scanner.nextLine().trim().toLowerCase();

        if (answer.equals("yes") || answer.equals("y")) {
            double newValue = readDouble(scanner, "Enter new temperature value: ");
            char newScale = readScale(scanner, "Enter new scale (C/F): ");
            temp.set(newValue, newScale);

            System.out.println();
            System.out.println("Updated temperature : " + temp);
            System.out.printf("In Celsius          : %.2f°C%n", temp.getInCelsius());
            System.out.printf("In Fahrenheit       : %.2f°F%n", temp.getInFahrenheit());
        }

        System.out.println();
        System.out.println("Goodbye!");
        scanner.close();
    }
}
