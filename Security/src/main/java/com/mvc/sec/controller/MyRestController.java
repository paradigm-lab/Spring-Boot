package com.mvc.sec.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

// @Controller
// @ResponseBody // Returns directly as a response (No jsp page will be searched by this name)
@RestController
public class MyRestController {

    @RequestMapping(value = "/greet/{yourName}", method = RequestMethod.GET)
    public String greet(@PathVariable("yourName") String name) {

        return "Good Evening " + name;
    }
}
