package com.abbeloosindustries.ramen.bootloader;

import com.abbeloosindustries.ramen.model.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        loadData();
    }

    private void loadData(){
        Broth chickenBroth = new Broth();
        chickenBroth.setQuantity(5);
        chickenBroth.setType("Chicken broth");

        MeatNoMeat meat = new MeatNoMeat();
        meat.setName("Ribs");
        meat.setQuantity(3);

        Noodles eggNoodle = new Noodles();
        eggNoodle.setName("Egg noodle");
        eggNoodle.setQuantity(10);

        Topping sesameSeed = new Topping();
        sesameSeed.setName("Sesami seed");
        sesameSeed.setQuantity(5);

        Vegatable pakChoy = new Vegatable();
        pakChoy.setName("Pakchoy");
        pakChoy.setQuantity(5);

    }
}
