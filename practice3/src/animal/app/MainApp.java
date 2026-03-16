package animal.app;

import animal.model.Animal;
import animal.model.Dog;

import java.util.ArrayList;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        Animal a1 = new Dog("Arlan", 3 , "Retriever");
        Animal d1 = new Dog ("Rex", 2, "Boxer");
        Animal d2 = new Dog("Blaze", 4 , "Shepherd");

        List<Animal> animals = new ArrayList<>();
        animals.add(a1);
        animals.add(d1);
        animals.add(d2);

        for(Animal a : animals){
            System.out.println("=== Animal Info ===");
            a.getInfo();
            a.makeSound();
            a.eat();
            a.eat("pizza");
            System.out.println();
        }
    }
}
