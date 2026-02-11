import java.util.Scanner;

public class Student {

    private String name;
    private String id;
    private int yearOfStudy;

    public Student(String name, String id) {
        this.name = name;
        this.id = id;
        this.yearOfStudy = 1;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id.toUpperCase();
    }

    public void incrementYear() {
        if (yearOfStudy < 4) {
            yearOfStudy++;
        } else {
            System.out.println("Warning: Maximum year reached (Student graduated sorry).");
        }
    }

    @Override
    public String toString() {
        return "Student: " + name + " | ID: " + getId() + " | Year: " + yearOfStudy;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputName;
        String inputId;

        do {
            System.out.print("Enter name: ");
            inputName = scanner.nextLine();
            if (inputName.trim().isEmpty()) {
                System.out.println("Warning: Name cannot be empty! Try again");
            }
        } while (inputName.trim().isEmpty());

        do {
            System.out.print("Enter ID: ");
            inputId = scanner.nextLine();
            if (inputId.trim().isEmpty()) {
                System.out.println("Warning: ID cannot be empty! Try again");
            }
        } while (inputId.trim().isEmpty());

        Student student = new Student(inputName, inputId);
        System.out.println("\nCreated: " + student);

        while (true) {
            System.out.print("\nIncrement year? (yes/no): ");
            if (scanner.nextLine().equalsIgnoreCase("yes")) {
                student.incrementYear();
                System.out.println(student);
            } else {
                break;
            }
        }

        scanner.close();
    }
}