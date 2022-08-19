package org.example;

public class Country {
    private String countryName;
    private char countrySign;

    public Country(String countryName, char countrySign) {
        this.countryName = countryName;
        this.countrySign = countrySign;
    }

    @Override
    public String toString() {
        return countryName + " - " + countrySign;
    }

    public char getCountrySign() {
        return countrySign;
    }
}
