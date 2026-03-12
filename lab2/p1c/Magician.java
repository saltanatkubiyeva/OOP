package p1c;

import java.util.Objects;

public class Magician {
    public enum WandCore {
        PHOENIX_FEATHER, DRAGON_HEARTSTRING, UNICORN_HAIR
    }

    private String name;
    private int age;
    private WandCore wandCore;

    public Magician(String name, int age, WandCore wandCore) {
        this.name = name;
        this.age = age;
        this.wandCore = wandCore;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public WandCore getWandCore() {
        return wandCore;
    }

    public void setName(String name) {
        this.name=name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWandCore(WandCore wandCore) {
        this.wandCore = wandCore;
    }

    @Override
    public String toString() {
        return "Magician: " + name + " | Age: " + age + " | WandCore: " + wandCore;
    }

    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (o == null ) return false;
        if ( !(o instanceof Magician)) return false;

        Magician other = (Magician) o;

        return Objects.equals(name, other.name) && Objects.equals(wandCore, other.wandCore);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, wandCore);
    }
}
