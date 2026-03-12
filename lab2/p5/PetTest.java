package p5;

public class PetTest {
    public static void main(String[] args) {

        Employee alua = new Employee("Alua", 22, "Software Engineer");
        Student madi = new Student("Madi", 20, "Computer Science");
        PhDStudent elsa = new PhDStudent("Elsa", 22, "Computer Science", "Artificial Intelligence");
        PhDStudent ali = new PhDStudent("Ali", 23, "Software Engineering", "Cybersecurity");
        Student zhanel = new Student("Zhanel", 18, "Information Systems");

        Cat pushok = new Cat("Mimi", 3);
        Dog bars = new Dog("Arlan", 5);
        Bird kiwi = new Bird("Kiwi", 2);
        Fish nemo = new Fish("Nemo", 1);


        System.out.println("=== ASSIGNING PETS ===");
        alua.assignPet(bars);
        madi.assignPet(pushok);
        elsa.assignPet(kiwi);
        ali.assignPet(nemo);


        System.out.println("\n=== PhD RESTRICTION TEST ===");
        elsa.assignPet(new Dog("Rex", 3)); //restricted


        System.out.println("\n=== SETTING UP REGISTRY ===");
        PersonRegistry registry = new PersonRegistry();
        registry.addPerson(alua);
        registry.addPerson(madi);
        registry.addPerson(elsa);
        registry.addPerson(ali);
        registry.addPerson(zhanel);


        System.out.println("\n=== REGISTRY BEFORE VACATION ===");
        System.out.println(registry);


        System.out.println("=== VACATION TIME ===");
        //But Madi already has one
        alua.leavePetWith(madi);

        // But Elsa is a phDStudent
        alua.leavePetWith(elsa);
        
        // Alua leaves Bars with Zhanel
        alua.leavePetWith(zhanel);


        System.out.println("\n=== REGISTRY DURING VACATION ===");
        System.out.println(registry);

        System.out.println("=== ALUA RETURNS ===");
        alua.retrievePetFrom(zhanel);


        System.out.println("\n=== REGISTRY AFTER VACATION ===");
        System.out.println(registry);


        System.out.println("=== PEOPLE WITH PETS ===");
        for (Person p : registry.findWithPet()) {
            System.out.println(p.getName());
        }

        System.out.println("\n=== PEOPLE WITHOUT PETS ===");
        for (Person p : registry.findWithoutPet()) {
            System.out.println(p.getName());
        }
    }
}