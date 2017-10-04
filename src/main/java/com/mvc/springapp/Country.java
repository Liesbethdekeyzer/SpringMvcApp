package com.mvc.springapp;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public enum Country {


    BELGIUM("Belguim"), THENEDERLANDS("The Nederlands"), GERMANY("Germany"), FRANCE("France");

    private String country;

    Country(String country) {
        this.country=country;
    }

    public String getName(){
        return country;
    }

    public static List<String> getCountries(){
        return(List<String>) Arrays.stream(Country.values()).map(country -> country.getName()).collect(Collectors.toList());
    }
}
