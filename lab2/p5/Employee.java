package p5;

public class Employee extends Person{
    private String job;

    public Employee(String name, int age, String job) {
        super(name,age);
        this.job = job;
    }

    public String getJob() {return job;}
    public void setJob(String job) {this.job = job;}

    @Override
    public String getOccupation() {
        return "Employee | Job: " + job;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
