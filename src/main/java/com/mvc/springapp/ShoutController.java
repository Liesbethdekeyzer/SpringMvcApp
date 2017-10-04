package com.mvc.springapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/shout")
public class ShoutController {

    @RequestMapping("/processFromVersionTwo")
    public String letsShoutDude(@RequestParam("studentName") String theName, Model model){

        String shout = "Hey My Friend! " + theName.toUpperCase();

        model.addAttribute("shout", shout);
        model.addAttribute("country", Country.getCountries());
        return "shout";
    }

}
