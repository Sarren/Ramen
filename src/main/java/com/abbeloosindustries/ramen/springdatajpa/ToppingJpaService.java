package com.abbeloosindustries.ramen.services.springdatajpa;

import com.abbeloosindustries.ramen.model.Topping;
import com.abbeloosindustries.ramen.repositories.ToppingRepository;
import com.abbeloosindustries.ramen.services.ToppingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("SpringDatajpa")
public class ToppingJpaService implements ToppingService {

    private final ToppingRepository toppingRepository;

    public ToppingJpaService(ToppingRepository toppingRepository) {
        this.toppingRepository = toppingRepository;
    }

    @Override
    public Set<Topping> findAll() {
        Set<Topping> toppings = new HashSet<>();
        toppingRepository.findAll().forEach(toppings::add);
        return toppings;
    }

    @Override
    public Topping findById(Long aLong) {
        return null;
    }

    @Override
    public Topping save(Topping object) {
        return null;
    }

    @Override
    public void delete(Topping object) {

    }

    @Override
    public void deleteById(Long aLong) {

    }
}
