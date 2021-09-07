package org.example.vehicle;

public class Truck extends LandCraft {

    @Override
    public void transport() {
        System.out.println("Transporting truck stuff.");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Truck{");
        sb.append('}');
        return sb.toString();
    }
}
