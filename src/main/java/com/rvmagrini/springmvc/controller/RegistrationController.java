package com.rvmagrini.springmvc.controller;

import com.rvmagrini.springmvc.model.Registration;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class RegistrationController {

    @GetMapping("registration")
    public String setRegistration(@ModelAttribute ("registration")Registration registration) {
        return "registration";
    }

    @PostMapping("registration")
    public String addRegistration(@Valid @ModelAttribute ("registration")Registration registration,
                                  BindingResult result) {

        if (result.hasErrors()) {
            System.out.println("Validation error");
            return "registration";
        }

        System.out.println("Registration: " + registration.getName());
        return "redirect:registration";
    }

}
