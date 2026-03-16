package pr4.interfaces.services;

import pr4.interfaces.model.Student;

import java.util.Comparator;

public class NameComparator implements Comparator<Student> {
    @Override
    public int compare(Student s, Student other) {
        return s.getName().compareTo(other.getName());
    }
}
