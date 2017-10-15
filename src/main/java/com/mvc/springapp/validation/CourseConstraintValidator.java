package com.mvc.springapp.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseConstraintValidator implements ConstraintValidator<CourseCode, String> {

    private String coursePrefix;

    public void initialize(CourseCode courseCode) {
        coursePrefix = courseCode.value();
    }

    public boolean isValid(String theCode, ConstraintValidatorContext constraintValidatorContext) {

        if(theCode != null) {
            return theCode.startsWith(coursePrefix);
        }
        return true;
    }

}
