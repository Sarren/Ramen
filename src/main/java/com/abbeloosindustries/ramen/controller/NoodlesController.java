package com.abbeloosindustries.ramen.controller;

import com.abbeloosindustries.ramen.services.Noodleservice;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/noodles")
public class NoodlesController {

    private final Noodleservice noodleService;

    public NoodlesController(Noodleservice noodleService) {
        this.noodleService = noodleService;
    }

    @GetMapping("/findall")
    public String findAllNoodles(Model model){
        model.addAttribute("noodles", noodleService.findAll());
        return "Noodles/findall";
    }

}
