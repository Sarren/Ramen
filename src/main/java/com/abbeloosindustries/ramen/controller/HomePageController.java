package com.abbeloosindustries.ramen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({"/", "", "/index"})
public class HomePageController {

    @GetMapping("/homepage")
    public String homePage(Model model){
        String text = "Click on order button to select the ramen you would like to order.";
        String menu = "Display menu";
        model.addAttribute("text", text)
            .addAttribute("menu", menu);

        return "HomePage/index";
    }

}
