package com.abbeloosindustries.ramen.controller;

import com.abbeloosindustries.ramen.services.VegetableService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/vegetable")
public class Vegetablecontroller {

    private final VegetableService vegetableService;

    public Vegetablecontroller(VegetableService vegetableService) {
        this.vegetableService = vegetableService;
    }

    @GetMapping("/findall")
    public String findAllVegetable(Model model){
        model.addAttribute("vegetables", vegetableService.findAll());
        return "Vegetable/findall";
    }
}
