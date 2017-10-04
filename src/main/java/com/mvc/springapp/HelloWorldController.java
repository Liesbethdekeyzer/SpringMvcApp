package com.mvc.springapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

    @RequestMapping("/")
    public String showIndexPage() {
        return "spring";
    }


    @RequestMapping("/showForm")
    public String showPage() {
        return "helloWorld-from";
    }

    @RequestMapping("/processForm")
    public String showtest() {
        return "helloWorld";
    }


}
