package org.example.vehicle;

public abstract class WaterCraft extends Vehicle implements Floatable {

    @Override
    public void launch() {
        System.out.println("Launching water-craft.");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("WaterCraft{");
        sb.append('}');
        return sb.toString();
    }
}
