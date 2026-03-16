package pr4.interfaces.model;

public class Cat implements CanHavePizza{
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void eatPizza() {
        System.out.println(name +  " is eating pizza.");
    }
}
