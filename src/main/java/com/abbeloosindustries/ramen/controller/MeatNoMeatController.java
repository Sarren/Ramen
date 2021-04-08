package com.abbeloosindustries.ramen.controller;

import com.abbeloosindustries.ramen.services.MeatNoMeatService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/meatnomeat")
@Controller
public class MeatNoMeatController {

    private final MeatNoMeatService meatNoMeatService;

    public MeatNoMeatController(MeatNoMeatService meatNoMeatService) {
        this.meatNoMeatService = meatNoMeatService;
    }

    @GetMapping("/findall")
    public String findAllMeatNoMeat(Model model){
        model.addAttribute("meats", meatNoMeatService.findAll());
        return "MeatNoMeat/findall";
    }
}
