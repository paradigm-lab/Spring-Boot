package com.mvc.sec.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)  // Secure it
    public String helloWorld(@RequestParam(name = "name", required = false, defaultValue = "World") String name, Model model) {
        model.addAttribute("name", name);

        return "hello-world";
    }

    @ResponseBody
    @RequestMapping(value = "/helloWorld", method = RequestMethod.GET)  // Don't secure this
    public String hello() {

        return "Hello Spring Security";
    }

    @ResponseBody
    @RequestMapping(value = "/bye", method = RequestMethod.GET) // secure it
    public String bye() {

        return "bye bye guys !!";
    }
}
