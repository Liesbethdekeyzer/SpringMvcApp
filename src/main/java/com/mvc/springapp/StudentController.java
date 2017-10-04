package com.mvc.springapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/student")
public class StudentController {

    @RequestMapping("/showForm")
    public String fillInForm(Model model) {

        Student theStudent = new Student();
        model.addAttribute("student", theStudent);
        model.addAttribute("country", Country.getCountries());

        return "student-from";
    }

    @RequestMapping("/processForm")
    public String processForm(@Valid @ModelAttribute("student") Student student, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "student-from";
        } else {
            return "student-confirmation";
        }
    }


}
