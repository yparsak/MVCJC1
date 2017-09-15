package com.sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class MVCJC1Controller {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String sayHelloAgain(ModelMap model) {
        model.addAttribute("response", "Hello");
        return "index";
    }
}
