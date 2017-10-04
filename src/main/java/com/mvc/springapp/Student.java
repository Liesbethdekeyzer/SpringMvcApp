package com.mvc.springapp;

import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class Student {

    @NotNull(message = "is required")
    @Size(min=1, message = "is required")
    private String lastName;
    private String firstName;
    private String country;
    private String favoriteLanguage;


    private List<String> countryOptions = Country.getCountries();
    private String[] operationSystem;


}
