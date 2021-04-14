package com.abbeloosindustries.ramen.controller;

import com.abbeloosindustries.ramen.model.Broth;
import com.abbeloosindustries.ramen.model.Ramen;
import com.abbeloosindustries.ramen.repositories.RamenRepository;
import com.abbeloosindustries.ramen.services.BrothService;
import com.abbeloosindustries.ramen.services.CreateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/broth")
@Controller
public class BrothController {

    private BrothService brothService;
    private CreateService createService;

    public BrothController(BrothService brothService, CreateService createService) {
        this.brothService = brothService;
        this.createService = createService;
    }

    @GetMapping("/findall")
    public String brothStock(Model model){
        model.addAttribute("broths", brothService.findAll());
        return "Broth/findall";
    }

    @GetMapping("/displaybroths")
    public String findBroths(Model model){
        createService.createOrder();
        model.addAttribute("broths", brothService.findAll());
        return "Broth/displaybroths";
    }

    @GetMapping("/{id}")
    public String addNewRamen(Model model, @PathVariable(required = false) Long id){
        createService.createRamen(id);
        model.addAttribute("broths", brothService.findAll());
        return "Broth/displaybroths";
    }
}
