package com.abbeloosindustries.ramen.controller;

import com.abbeloosindustries.ramen.model.Broth;
import com.abbeloosindustries.ramen.services.BrothService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/broth")
@Controller
public class BrothController {

    private BrothService brothService;

    public BrothController(BrothService brothService) {
        this.brothService = brothService;
    }

    @GetMapping("/findall")
    public String findBroths(Model model){
        model.addAttribute("broths", brothService.findAll());
        return "broth/findAll";
    }
}
