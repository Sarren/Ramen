package com.abbeloosindustries.ramen.springdatajpa;

import com.abbeloosindustries.ramen.model.Ramen;
import com.abbeloosindustries.ramen.repositories.RamenRepository;
import com.abbeloosindustries.ramen.services.RamenService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("SpringDataJpa")
public class RamenJpaService implements RamenService {

    private final RamenRepository ramenRepository;

    public RamenJpaService(RamenRepository ramenRepository) {
        this.ramenRepository = ramenRepository;
    }

    @Override
    public Set<Ramen> findAll() {
        Set<Ramen> ramenSet = new HashSet<>();
        ramenRepository.findAll().forEach(ramenSet::add);
        return ramenSet;
    }

    @Override
    public Ramen findById(Long aLong) {
        return null;
    }

    @Override
    public Ramen save(Ramen object) {
        return null;
    }

    @Override
    public void delete(Ramen object) {

    }

    @Override
    public void deleteById(Long aLong) {

    }
}
