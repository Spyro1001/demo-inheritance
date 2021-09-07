package org.example.vehicle;

public class Wrangler extends Jeep {

    @Override
    public void transport() {
        System.out.println("Transporting Wrangler stuff.");
    }

    @Override
    public void engage4WD() {
        System.out.println("Engaging Wrangler 4WD.");
    }

    @Override
    public void disengage4WD() {
        System.out.println("Disengaging Wrangler 4WD.");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Wrangler{");
        sb.append('}');
        return sb.toString();
    }
}
