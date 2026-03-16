import java.util.Scanner;

public class GradeBookTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Course course = new Course("CS101", "Object-oriented Programming and Design", 3, "None");

        GradeBook gradeBook = new GradeBook(course);

        gradeBook.displayMessage();
        System.out.println();

        String[] studentNames = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
        Student[] students = new Student[studentNames.length];
        for (int i = 0; i < studentNames.length; i++) {
            students[i] = new Student("Student " + studentNames[i], i + 1);
        }

        System.out.println("Please, input grades for students:");
        System.out.println();

        for (Student student : students) {
            int grade = -1;
            while (true) {
                System.out.print(student.getName() + ": ");
                String input = scanner.nextLine().trim();
                try {
                    grade = Integer.parseInt(input);
                    if (grade < 0 || grade > 100) {
                        System.out.println("  Invalid grade. Please enter a number between 0 and 100.");
                    } else {
                        break;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("  Invalid input. Please enter a numeric grade.");
                }
            }
            gradeBook.addStudentGrade(student, grade);
        }

        System.out.println();
        gradeBook.displayGradeReport();

        scanner.close();
    }
}
