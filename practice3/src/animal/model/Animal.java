package animal.model;

public abstract class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {return name;}
    public int getAge() {return age;}

    public abstract void makeSound();

    public void eat() {
        System.out.println(getName() + " eats.");
    }

    public void eat(String food) {
        System.out.println(getName() + " eats " + food + ".");
    }

    public void getInfo() {
        System.out.print("Name: " + getName() + " | " + "Age: " + getAge());
    }
}

