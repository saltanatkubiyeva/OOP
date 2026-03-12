package p1c;

import java.util.Objects;

public class HogwartsStudent extends Magician{

    public enum House {
        GRYFFINDOR, HUFFLEPUFF, RAVENCLAW, SLYTHERIN
    }

    private String studentId;
    private House house;

    public HogwartsStudent (String name, int age, WandCore wandCore, House house, String studentId) {
        super(name, age, wandCore);
        this.house = house;
        this.studentId = studentId;
    }

    public House getHouse() { return house; }
    public void setHouse(House house) { this.house = house; }

    public String getStudentId() { return studentId; }
    public void setStudentId(String studentId) { this.studentId = studentId; }

    @Override
    public String toString() {
        return super.toString() + " | House : " + house + " | ID: " + studentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (!(o instanceof HogwartsStudent)) return false;

        if(!super.equals(o)) return false;

        HogwartsStudent  other = (HogwartsStudent) o;
        return Objects.equals(studentId, other.studentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), studentId);
    }
}
