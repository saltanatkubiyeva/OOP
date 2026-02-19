import java.util.Vector;
import java.util.Scanner;

enum Gender {
    BOY, GIRL
}

class Person {
    private String name;
    private Gender gender;

    public Person(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
    }

    public Gender getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + "(" + (gender == Gender.BOY ? "B" : "G") + ")";
    }


}

public class DragonLaunch {
    private Vector<Person> kidnapped = new Vector<>();

    public void kidnap(Person p) {
        kidnapped.add(p);
        System.out.println("Kidnapped: " + p);
    }

    
    public boolean willDragonEatOrNot() {
        int boyCount = 0; 
        int remaining = 0;

        for (int i = 0; i < kidnapped.size(); i++) {
            Person p = kidnapped.get(i);
            if (p.getGender() == Gender.BOY) {
                boyCount++;
                remaining++;
            } else {
                if (boyCount > 0) {
                    boyCount--;
                    remaining-=2;
                } else {
                    remaining++;
                }
            }
        }

        return remaining > 0;
    }

    public void printLine() {
        System.out.print("Current line: ");
        for (Person p : kidnapped) {
            System.out.print(p.getGender() == Gender.BOY ? "B" : "G");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DragonLaunch launch = new DragonLaunch();

        System.out.println("Enter a sequence of B (boy) and G (girl), e.g. BBGG or GBGB:");
        String input = scanner.nextLine().trim().toUpperCase();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == 'B') {
                launch.kidnap(new Person("Person" + (i + 1), Gender.BOY));
            } else if (c == 'G') {
                launch.kidnap(new Person("Person" + (i + 1), Gender.GIRL));
            } else {
                System.out.println("Invalid character '" + c + "' at position " + (i + 1) + ". Skipping.");
            }
        }

        launch.printLine();

        boolean willEat = launch.willDragonEatOrNot();
        if (willEat) {
            System.out.println("Dragon WILL eat! Some people remain after all B-G pairs vanish.");
        } else {
            System.out.println("Dragon will NOT eat! All pairs vanished. No one is left.");
        }

        scanner.close();
    }
}
