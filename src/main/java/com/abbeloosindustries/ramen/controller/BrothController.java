package com.abbeloosindustries.ramen.controller;

import com.abbeloosindustries.ramen.model.Broth;
import com.abbeloosindustries.ramen.model.Ramen;
import com.abbeloosindustries.ramen.repositories.RamenRepository;
import com.abbeloosindustries.ramen.services.BrothService;
import com.abbeloosindustries.ramen.services.CreateService;
import com.abbeloosindustries.ramen.services.RamenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/broth")
@Controller
public class BrothController {

    private BrothService brothService;
    private CreateService createService;
    private RamenService ramenService;

    public BrothController(BrothService brothService, CreateService createService, RamenService ramenService) {
        this.brothService = brothService;
        this.createService = createService;
        this.ramenService = ramenService;
    }

    @GetMapping("/findall")
    public String brothStock(Model model){
        model.addAttribute("broths", brothService.findAll());
        return "Broth/findall";
    }

    @GetMapping("/displaybroths")
    public String findBroths(Model model){
        createService.createOrder();
        Ramen ramen = new Ramen();
        ramen.setId(1L);
        ramen.setName("Sarrens ramen");
        ramenService.save(ramen);
        model.addAttribute("ramen", ramen);
        model.addAttribute("broths", brothService.findAll());
        return "Broth/displaybroths";
    }

    @PostMapping("/addBroth")
    public String addBroth(Ramen ramen){
        System.out.println("Broth has been added");
        System.out.println(ramen.toString());
        return "MeatNoMeat/displaymeat";
    }

    @GetMapping("/{id}")
    public String addNewRamen(Model model, @PathVariable(required = false) Long id){
        createService.createRamen(id);
        model.addAttribute("broths", brothService.findAll());
        return "Broth/displaybroths";
    }
}
