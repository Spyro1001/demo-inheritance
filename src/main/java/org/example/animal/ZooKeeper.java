package org.example.animal;

import java.util.ArrayList;
import java.util.List;

public class ZooKeeper {

    public static void main(String[] args) {

        Animal bird = new Bird();
        Animal fish = new Fish();
        Animal reptile = new Reptile();

        Invertebrate inv = new Invertebrate();
        Mammal mammal = new Mammal();
        Amphibian amphibian = new Amphibian();

        List<Animal> animals = new ArrayList<>();
        animals.add(bird);
        animals.add(fish);
        animals.add(reptile);
        animals.add(inv);
        animals.add(mammal);
        animals.add(amphibian);

        for (Animal a : animals) {
            System.out.println(a.getClass().getSimpleName());
        }

    }
}
