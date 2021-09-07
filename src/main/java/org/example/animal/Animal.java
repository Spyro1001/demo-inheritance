package org.example.animal;

import java.util.List;

public abstract class Animal {

    // eukaryote
    List<Cell> cells;

    // heterotroph
    public void eat(String food) {
        System.out.println("Eating " + food);
    }
}
