package org.example.vehicle;

public abstract class Vehicle implements Conveyance {

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Vehicle{");
        sb.append('}');
        return sb.toString();
    }
}
