package org.example;

import java.util.ArrayList;

public class Car {
    private Producent producent;
    private boolean isAutomaticGear;
    private Market market;
    private String segment;
    private ArrayList<Dimension> dimensions;

    public Car() {
    }

    public Car(Producent producent, boolean isAutomaticGear, Market market, String segment, ArrayList<Dimension> dimensions) {
        this.producent = producent;
        this.isAutomaticGear = isAutomaticGear;
        this.market = market;
        this.segment = segment;
        this.dimensions = dimensions;
    }

    public boolean findAndDisplayCountry(ArrayList<Car> cars, String model, boolean isAutomaticGear, int trunk) {
        boolean countryFound = false;
        for (Car car : cars) {
            if (car.getProducent().getModel().equals(model)) {
                if (car.isAutomaticGear == isAutomaticGear) {
                    for (Dimension dimension : car.getDimensions()) {
                        if (dimension.getTrunkCapacity() > trunk) {
                            System.out.println(car.getMarket().getCountries().toString());
                            countryFound = true;
                            break;
                        }
                    }
                }
            }
        }
        return countryFound;
    }

    public Producent getProducent() {
        return producent;
    }

    public ArrayList<Dimension> getDimensions() {
        return dimensions;
    }

    public Market getMarket() {
        return market;
    }
}
