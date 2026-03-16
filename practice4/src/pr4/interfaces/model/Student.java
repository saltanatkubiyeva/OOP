package pr4.interfaces.model;

public class Student extends Person implements CanHavePizza, CanHaveRetake, Movable, Comparable<Student> {
    private double gpa;

    public Student (String name, double gpa) {
        super(name);
        this.gpa = gpa;
    }

    public Student (String name) {
        this(name, 3.5);
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public void eatPizza() {
        System.out.println(getName() + " is eating pizza.");
    }

    @Override
    public void retakeExam() {
        System.out.println(getName() + " is getting a retake.");
    }

    @Override
    public void dance() {
        System.out.println(getName() + " is dancing");
    }

    @Override
    public void move() {
        System.out.println(getName() + " is moving.");
    }

    @Override
    public int compareTo(Student other) {
        return Double.compare(gpa, other.gpa);
    }

    @Override
    public String toString() {
        return getName() + " (GPA: " + gpa + ")";
    }
}
