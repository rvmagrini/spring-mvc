package com.rvmagrini.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class GreetingController {

    @GetMapping("greeting")
    public String greeting(Map<String, Object> model) {
        model.put("message", "Hello greeting.jsp in 'webapp/jsp': greetings from Controller");
        return "greeting";
    }

    @GetMapping("thyme")
    public String thymeleaf(Map<String, Object> model) {
        model.put("message", "Hello thyme.html in 'webapp/views': greetings from Controller");
        return "thyme";
    }

}
