package org.example.vehicle;

public abstract class LandCraft extends Vehicle {

    @Override
    public void transport() {
        System.out.println("Transporting land-craft stuff.");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("LandCraft{");
        sb.append('}');
        return sb.toString();
    }
}
