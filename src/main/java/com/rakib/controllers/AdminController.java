package com.rakib.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @RequestMapping(value = "",method = RequestMethod.GET)
    public String adminPage(Model model){
        model.addAttribute("msg","Welcome to Admin page");
        return "admin";
    }
}
