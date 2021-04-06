package com.abbeloosindustries.ramen.services.springdatajpa;

import com.abbeloosindustries.ramen.model.Vegetable;
import com.abbeloosindustries.ramen.repositories.VegetableRepository;
import com.abbeloosindustries.ramen.services.VegetableService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("SpringDataJpa")
public class VegetableMapJpaService implements VegetableService {

    private final VegetableRepository vegetableRepository;

    public VegetableMapJpaService(VegetableRepository vegetableRepository) {
        this.vegetableRepository = vegetableRepository;
    }

    @Override
    public Set<Vegetable> findAll() {
        Set<Vegetable> vegetables = new HashSet<>();
        vegetableRepository.findAll().forEach(vegetables::add);
        return vegetables;
    }

    @Override
    public Vegetable findById(Long aLong) {
        return null;
    }

    @Override
    public Vegetable save(Vegetable object) {
        return null;
    }

    @Override
    public void delete(Vegetable object) {

    }

    @Override
    public void deleteById(Long aLong) {

    }
}
