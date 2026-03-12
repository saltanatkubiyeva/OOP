package p5;

import java.util.ArrayList;

public class PersonRegistry {
    private ArrayList<Person> people;

    public PersonRegistry() {
        people = new ArrayList<>();
    }

    public void addPerson(Person p) {
        people.add(p);
        System.out.println(p.getName() + " added to registry.");
    }

    public void removePerson(Person p) {
        if(people.remove(p)) {
            System.out.println(p.getName() + " is removed from registry.");
        } else {
            System.err.println(p.getName() + " not found in registry!");
        }
    }

    public ArrayList<Person> findWithPet() {
        ArrayList<Person> result = new ArrayList<>();
        for(Person p : people) {
            if (p.hasPet()) result.add(p);
        }
        return result;
    }

    public ArrayList<Person> findWithoutPet() {
        ArrayList<Person> result = new ArrayList<>();
        for(Person p : people) {
            if (!p.hasPet()) result.add(p);
        }
        return result;
    }

    @Override
    public String toString() {
        String result = "";
        for (Person p : people) {
            result += p.toString() + "\n";
        }
        return result;
    }
    }
