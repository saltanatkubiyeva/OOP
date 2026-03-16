/**
 * Problem 1 - Theory Questions
 *
 * 1. What is the core difference between a class and an interface?
 *    A class is a blueprint that can have fields, constructors, and method implementations.
 *    An interface is a contract that only defines what methods a class must implement,
 *    without any state or implementation (by default).
 *
 * 2. Can interfaces have fields? If yes, what are the implicit modifiers for them?
 *    Yes, interfaces can have fields, but they are implicitly public static final,
 *    meaning they are constants shared across all classes.
 *
 * 3. Can a class implement multiple interfaces? Explain why this is useful.
 *    Yes. For example, Student implements CanHavePizza, CanHaveRetake, and Movable.
 *    This is useful because a class can fulfill multiple contracts at the same time,
 *    which Java doesn't allow with classes (we can only extend one class).
 */
package pr4.interfaces.main;

import pr4.interfaces.model.Cat;
import pr4.interfaces.model.Student;
import pr4.interfaces.model.LogicGame;
import pr4.interfaces.model.MemoryGame;
import pr4.interfaces.model.iPhone;
import pr4.interfaces.services.CountingSort;
import pr4.interfaces.services.NameComparator;
import pr4.interfaces.services.Restaurant;
import pr4.interfaces.services.App;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Problem 2
        System.out.println("=== Problem 2 ===");
        Cat c1 = new Cat("Kitty");
        Student s1 = new Student("Alua", 3.5);
        Restaurant r1 = new Restaurant();
        r1.servePizza(c1);
        r1.servePizza(s1);

        // Problem 3
        System.out.println("\n=== Problem 3 ===");
        App app = new App();
        app.getStatistics(new LogicGame());
        app.getStatistics(new MemoryGame());

        System.out.println("\n");
        iPhone myPhone = new iPhone("iPhone 14 Pro Max");
        myPhone.sell();
        myPhone.plug();

        // Problem 4
        System.out.println("\n=== Problem 4 ===");
        List<Student> students = new ArrayList<>();
        students.add(new Student("Lima", 2.8));
        students.add(new Student("Elsa", 3.9));
        students.add(new Student("Adam", 3.4));

        System.out.println("\nSorting students by gpa:");
        Collections.sort(students);
        System.out.println(students);

        System.out.println("\nSorting students by name:");
        Collections.sort(students, new NameComparator());
        System.out.println(students);

        // Bonus Task
        System.out.println("\n=== Bonus Task===");
        int[] arr = {2,1,5,0,1,1,3,4,8,8};
        System.out.println("Input: " +  Arrays.toString(arr));
        int[] sorted = CountingSort.sort(arr);
        System.out.println("Output: " + Arrays.toString(sorted));
    }

}