package com.abbeloosindustries.ramen.controller;

import com.abbeloosindustries.ramen.services.ToppingService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/topping")
public class ToppingController {

    private final ToppingService toppingService;

    public ToppingController(ToppingService toppingService) {
        this.toppingService = toppingService;
    }

    @GetMapping("/findall")
    public String findAllToppings(Model model){
        model.addAttribute("toppings", toppingService.findAll());
        return "Topping/findall";
    }
}
