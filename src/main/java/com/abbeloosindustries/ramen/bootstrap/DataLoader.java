package com.abbeloosindustries.ramen.bootstrap;

import com.abbeloosindustries.ramen.model.*;
import com.abbeloosindustries.ramen.services.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final BrothService brothService;
    private final MeatNoMeatService meatNoMeatService;
    private final Noodleservice noodleservice;
    private final ToppingService toppingService;
    private final VegetableService vegetableService;
    private final RamenService ramenService;

    public DataLoader(BrothService brothService, MeatNoMeatService meatNoMeatService, Noodleservice noodleservice,
                      ToppingService toppingService, VegetableService vegetableService, RamenService ramenService) {
        this.brothService = brothService;
        this.meatNoMeatService = meatNoMeatService;
        this.noodleservice = noodleservice;
        this.toppingService = toppingService;
        this.vegetableService = vegetableService;
        this.ramenService = ramenService;
    }

    @Override
    public void run(String... args) throws Exception {
        loadData();
    }

    private void loadData(){
        Broth chickenBroth = new Broth();
        chickenBroth.setQuantity(5);
        chickenBroth.setType("Chicken broth");
        chickenBroth.setPrice(2.0);
        brothService.save(chickenBroth);

        Broth vegiBroth = new Broth();
        vegiBroth.setQuantity(2);
        vegiBroth.setType("Vegitarian Broth");
        vegiBroth.setPrice(2.0);
        brothService.save(vegiBroth);

        MeatNoMeat ribs = new MeatNoMeat();
        ribs.setName("Ribs");
        ribs.setQuantity(3);
        ribs.setPrice(3.5);
        meatNoMeatService.save(ribs);

        MeatNoMeat tofu = new MeatNoMeat();
        tofu.setName("Tofu");
        tofu.setQuantity(7);
        tofu.setPrice(2.5);
        meatNoMeatService.save(tofu);

        Noodles eggNoodle = new Noodles();
        eggNoodle.setName("Egg noodle");
        eggNoodle.setQuantity(10);
        noodleservice.save(eggNoodle);

        Topping sesameSeed = new Topping();
        sesameSeed.setName("Sesami seed");
        sesameSeed.setQuantity(5);
        toppingService.save(sesameSeed);

        Vegetable pakChoy = new Vegetable();
        pakChoy.setName("Pakchoy");
        pakChoy.setQuantity(5);
        vegetableService.save(pakChoy);

    }
}
