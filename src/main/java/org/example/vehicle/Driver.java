package org.example.vehicle;

public class Driver {

    public static void main(String[] args) {

        Vehicle boat = new Boat();
        Vehicle ship = new Ship();

        // Narrowing or down cast
        ((Boat)boat).launch();
        ((Ship)ship).launch();

        new Boat().launch();


    }
}
