package p1c;

import java.util.HashSet;

public class HogwartsTest {
    public static void main(String[] args) {
        System.out.println( "=== OBJECT CREATION ===");
        HogwartsStudent harry = new HogwartsStudent("Harry", 12, Magician.WandCore.PHOENIX_FEATHER,
                HogwartsStudent.House.GRYFFINDOR, "HW-001");

        HogwartsStudent harry2 = new HogwartsStudent("Harry", 12, Magician.WandCore.PHOENIX_FEATHER,
                HogwartsStudent.House.GRYFFINDOR, "HW-001");

        HogwartsStudent hermione = new HogwartsStudent("Hermione", 12, Magician.WandCore.DRAGON_HEARTSTRING,
                HogwartsStudent.House.GRYFFINDOR, "HW-002");

        System.out.println("Created : Harry (HW-001), Harry Duplicate (HW-001), Hermione(HW-002)");

        System.out.println("\n === HASHCODES ===");
        System.out.println("Harry hashCode: " + harry.hashCode());
        System.out.println("Harry Duplicate hashCode: " + harry2.hashCode());
        System.out.println("Hermione hashCodCe: " + hermione.hashCode());

        System.out.println("\n=== HASHSET ===");

        HashSet<HogwartsStudent> students = new HashSet<>();
        students.add(harry);
        students.add(harry2);
        students.add(hermione);

        System.out.println("How many students are in?: " + students.size());

        System.out.println("\n=== Magician VS Student ===");
        Magician hermione2 = new Magician("Hermione", 12, Magician.WandCore.DRAGON_HEARTSTRING);
        System.out.println("Magician Hermione's Hash: " + hermione2.hashCode());
        System.out.println("Student Hermione's Hash: " + hermione.hashCode()); // calculates  +ID;
        System.out.println("Are they same?: " + hermione.equals(hermione2));
    }
}


