import java.util.ArrayList;
import java.util.List;

public class GradeBook {
    private Course course;
    private List<Student> students;
    private List<Integer> grades;

    public GradeBook(Course course) {
        this.course = course;
        this.students = new ArrayList<>();
        this.grades = new ArrayList<>();
    }

    public GradeBook(Course course, List<Student> students, List<Integer> grades) {
        this.course = course;
        this.students = new ArrayList<>(students);
        this.grades = new ArrayList<>(grades);
    }

    public void addStudentGrade(Student student, int grade) {
        students.add(student);
        grades.add(grade);
    }

    public void displayMessage() {
        System.out.println("Welcome to the grade book for " + course.getName() + " " + course.getDescription() + "!");
    }

    public double determineClassAverage() {
        if (grades.isEmpty()) return 0;
        int sum = 0;
        for (int g : grades) sum += g;
        return (double) sum / grades.size();
    }

    public int determineHighestGrade() {
        if (grades.isEmpty()) return -1;
        int max = grades.get(0);
        for (int g : grades) if (g > max) max = g;
        return max;
    }

    public int determineLowestGrade() {
        if (grades.isEmpty()) return -1;
        int min = grades.get(0);
        for (int g : grades) if (g < min) min = g;
        return min;
    }

    public Student getStudentWithHighestGrade() {
        if (grades.isEmpty()) return null;
        int maxIdx = 0;
        for (int i = 1; i < grades.size(); i++)
            if (grades.get(i) > grades.get(maxIdx)) maxIdx = i;
        return students.get(maxIdx);
    }

    public Student getStudentWithLowestGrade() {
        if (grades.isEmpty()) return null;
        int minIdx = 0;
        for (int i = 1; i < grades.size(); i++)
            if (grades.get(i) < grades.get(minIdx)) minIdx = i;
        return students.get(minIdx);
    }

    public void outputBarChart() {
        System.out.println("Grades distribution:");
        int[] frequency = new int[11]; 
        for (int g : grades) {
            if (g == 100) frequency[10]++;
            else frequency[g / 10]++;
        }
        String[] labels = {"00-09", "10-19", "20-29", "30-39", "40-49",
                           "50-59", "60-69", "70-79", "80-89", "90-99", "100"};
        for (int i = 0; i < frequency.length; i++) {
            System.out.print(labels[i] + ": ");
            for (int j = 0; j < frequency[i]; j++) System.out.print("*");
            System.out.println();
        }
    }

    public void displayGradeReport() {
        double avg = determineClassAverage();
        int highest = determineHighestGrade();
        int lowest = determineLowestGrade();
        Student highStudent = getStudentWithHighestGrade();
        Student lowStudent = getStudentWithLowestGrade();

        System.out.printf("Class average is %.2f. Lowest grade is %d (%s).%n", avg, lowest, lowStudent);
        System.out.printf("Highest grade is %d (%s).%n", highest, highStudent);
        System.out.println();
        outputBarChart();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("GradeBook for ").append(course.getName()).append(":\n");
        for (int i = 0; i < students.size(); i++) {
            sb.append("  ").append(students.get(i).getName()).append(": ").append(grades.get(i)).append("\n");
        }
        return sb.toString();
    }
}
