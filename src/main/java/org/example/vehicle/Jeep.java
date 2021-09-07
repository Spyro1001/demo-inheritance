package org.example.vehicle;

public class Jeep extends SportUtilityVehicle {

    @Override
    public void transport() {
        System.out.println("Transporting Jeep stuff.");
    }

    @Override
    public void engage4WD() {
        System.out.println("Engaging Jeep 4WD.");
    }

    @Override
    public void disengage4WD() {
        System.out.println("Disengaging Jeep 4WD.");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Jeep{");
        sb.append('}');
        return sb.toString();
    }
}
