package com.rakib.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping(value = "",method = RequestMethod.GET)
    public String showUserPage(Model model){
        model.addAttribute("msg","Welcome to user page");
        return "user";
    }
}
