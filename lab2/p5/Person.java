package p5;

import java.util.Objects;

public abstract class Person {
    private String name;
    private int age;
    private Animal pet;

    public Person(String name, int age) {
        this.name = name;
        this.age =age;
        this.pet = null;
    }

    public String getName() {return name;}
    public int getAge() {return age;}
    public Animal getPet() {return pet;}

    public abstract String getOccupation();

    // PET METHODS

    public void assignPet(Animal pet) { // own pet
        this.pet = pet;
    }

    public void removePet() {
        this.pet = null;
    }

    public boolean hasPet() {
        return pet!= null;
    }

    // VACATION METHODS

    public void leavePetWith(Person other) {
        if(!hasPet()){
            System.err.println(name + " does not have a pet to leave:(");
            return;
        }

        if (other.hasPet()) {
            System.err.println(other.getName() + " already has a pet, and cannot take another:(");
            return;
        }

        if (other instanceof PhDStudent && this.pet instanceof Dog) {
            System.err.println(other.getName() + " is a PhD student and cannot take a dog:(");
            return;
        }

        other.assignPet(this.pet);
        this.removePet();
        System.out.println( name + " left their pet " + other.pet.getName() + " with " + other.getName());
    }

    public void retrievePetFrom(Person other) {
        if (!other.hasPet()) {
            System.out.println(other.getName() + " does not have a pet to return:(");
            return;
        }

        this.assignPet(other.getPet());
        other.removePet();
        System.out.println( name + " retrieved their pet " + this.pet.getName() + " from " + other.getName());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (!(o instanceof Person)) return false;

        Person other = (Person) o;
        return Objects.equals(name, other.name) && age == other.age;
    }

    @Override
    public int hashCode () {
        return Objects.hash(name,age);
    }

    @Override
    public String toString() {
        String petInfo = hasPet() ? pet.toString() : "No pet";
        return name + " | Age: " + age +
                " | " + getOccupation() +
                " | Pet: " + petInfo;
    }







}
