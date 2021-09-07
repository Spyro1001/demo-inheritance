package org.example.vehicle;

public class Car extends LandCraft {

    @Override
    public void transport() {
        System.out.println("Transporting car stuff.");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Car{");
        sb.append('}');
        return sb.toString();
    }
}
