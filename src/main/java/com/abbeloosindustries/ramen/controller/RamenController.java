package com.abbeloosindustries.ramen.controller;

import com.abbeloosindustries.ramen.services.RamenService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ramen")
public class RamenController {

    private final RamenService ramenService;

    public RamenController(RamenService ramenService) {
        this.ramenService = ramenService;
    }

    @GetMapping("findall")
    public String findAllRamen(Model model){
        model.addAttribute("allRamen", ramenService.findAll());
        return "Ramen/findall";
    }

}
