package org.example.vehicle;

public class Ship extends WaterCraft {

    @Override
    public void transport() {
        System.out.println("Transporting ship stuff.");
    }

    @Override
    public void launch() {
        System.out.println("Launching ship.");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Ship{");
        sb.append('}');
        return sb.toString();
    }
}
