package com.rakib.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HomeController {

    @RequestMapping(value = "/home",method = RequestMethod.GET)
    public String index(Model model){
        model.addAttribute("msg","Welcome to home page");
        return "index";
    }
}
