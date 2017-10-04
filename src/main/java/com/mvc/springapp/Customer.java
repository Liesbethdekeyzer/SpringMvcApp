package com.mvc.springapp;

import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Component
@Data
public class Customer {
    @NotNull(message = "firstName is required")
    @Size(min=1, message ="firstName is required")
    private String firstName;
    @NotNull(message = "lastName is required")
    @Size(min=1,message = "lastName is required")
    private String lastName;

}
