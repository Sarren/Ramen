package com.abbeloosindustries.ramen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/order")
public class OrderController {

    @RequestMapping("/order")
    public String startRamenOrder(Model model){
        return "Order/order";
    }
}
