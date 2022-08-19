package org.example;

public class Main {
    public static void main(String[] args) {

        if (!(new Car()).findAndDisplayCountry((new Factory()).generateCarsObjects(), "BMW", true, 300)) {
            System.out.println("Country not found");
        }

    }
}