package com.mvc.springapp;

import org.springframework.stereotype.Component;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
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
    @Min(value=0,message = "Min free passes is 0")
    @Max(value=10,message = "Max freepasses is 10")
    private Integer freePasses;

    @Pattern(regexp ="^[a-zA-Z0-9]{5}", message = "only 5 chards/digits")
    private String postalCode;



}
