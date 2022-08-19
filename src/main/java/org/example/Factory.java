package org.example;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Factory {

    public ArrayList<Car> generateCarsObjects() {
        ArrayList<String> segments = new ArrayList<>();
        segments.add("Standard");
        segments.add("Medium");
        segments.add("Premium");

        ArrayList<Country> countriesList = new ArrayList<>();
        countriesList.add(new Country("Anglia", 'A'));
        countriesList.add(new Country("Belgia", 'B'));
        countriesList.add(new Country("Chorwacja", 'C'));
        countriesList.add(new Country("Dania", 'D'));
        countriesList.add(new Country("Polska", 'P'));

        ArrayList<Market> markets = new ArrayList<>();
        markets.add(new Market("Special", countriesList
                .stream()
                .filter(country -> country.getCountrySign() == 'P' || country.getCountrySign() == 'A')
                .collect(Collectors.toList())));
        markets.add(new Market("Cargo", countriesList
                .stream()
                .filter(country -> country.getCountrySign() == 'A' || country.getCountrySign() == 'C')
                .collect(Collectors.toList())));
        markets.add(new Market("Business", countriesList
                .stream()
                .filter(country -> country.getCountrySign() == 'P' || country.getCountrySign() == 'D')
                .collect(Collectors.toList())));
        markets.add(new Market("Transport", countriesList
                .stream()
                .filter(country -> country.getCountrySign() == 'C' || country.getCountrySign() == 'D')
                .collect(Collectors.toList())));
        markets.add(new Market("Individual", countriesList
                .stream()
                .filter(country -> country.getCountrySign() == 'B' || country.getCountrySign() == 'P' || country.getCountrySign() == 'C')
                .collect(Collectors.toList())));

        ArrayList<Dimension> dimensions = new ArrayList<>();
        dimensions.add(new Dimension(70, 135, 220));
        dimensions.add(new Dimension(80, 145, 240));
        dimensions.add(new Dimension(90, 155, 440));
        dimensions.add(new Dimension(77, 140, 180));
        dimensions.add(new Dimension(95, 155, 350));
        dimensions.add(new Dimension(85, 148, 300));
        dimensions.add(new Dimension(88, 158, 240));
        dimensions.add(new Dimension(100, 166, 380));
        dimensions.add(new Dimension(82, 145, 310));
        dimensions.add(new Dimension(79, 138, 140));

        ArrayList<Producent> producents = new ArrayList<>();
        producents.add(new Producent("BMW", "3"));
        producents.add(new Producent("BMW", "X5"));
        producents.add(new Producent("BMW", "Z4"));
        producents.add(new Producent("BMW", "X3"));
        producents.add(new Producent("Audi", "A1"));
        producents.add(new Producent("Audi", "A6"));
        producents.add(new Producent("Toyota", "Camry"));
        producents.add(new Producent("Toyota", "Corrola"));
        producents.add(new Producent("Kia", "Ceed"));
        producents.add(new Producent("Kia", "Stinger"));

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car(producents.get(4), true, markets.get(3), segments.get(0), dimensions));
        cars.add(new Car(producents.get(0), true, markets.get(0), segments.get(0), dimensions));
        cars.add(new Car(producents.get(1), false, markets.get(1), segments.get(1), dimensions));
        cars.add(new Car(producents.get(2), true, markets.get(4), segments.get(2), dimensions));
        cars.add(new Car(producents.get(3), false, markets.get(2), segments.get(0), dimensions));
        cars.add(new Car(producents.get(4), true, markets.get(3), segments.get(1), dimensions));
        cars.add(new Car(producents.get(5), false, markets.get(1), segments.get(2), dimensions));
        cars.add(new Car(producents.get(6), false, markets.get(2), segments.get(0), dimensions));
        cars.add(new Car(producents.get(7), true, markets.get(4), segments.get(1), dimensions));
        cars.add(new Car(producents.get(8), true, markets.get(1), segments.get(2), dimensions));
        cars.add(new Car(producents.get(9), false, markets.get(3), segments.get(0), dimensions));
        cars.add(new Car(producents.get(7), false, markets.get(1), segments.get(1), dimensions));
        cars.add(new Car(producents.get(5), false, markets.get(4), segments.get(0), dimensions));
        cars.add(new Car(producents.get(6), true, markets.get(2), segments.get(2), dimensions));
        cars.add(new Car(producents.get(8), false, markets.get(1), segments.get(1), dimensions));

        return cars;
    }

}
