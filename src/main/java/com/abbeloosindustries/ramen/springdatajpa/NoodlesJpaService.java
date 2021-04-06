package com.abbeloosindustries.ramen.services.springdatajpa;

import com.abbeloosindustries.ramen.model.Noodles;
import com.abbeloosindustries.ramen.repositories.NoodlesRepository;
import com.abbeloosindustries.ramen.services.Noodleservice;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("SpringDataJpa")
public class NoodlesJpaService implements Noodleservice {

    private final NoodlesRepository noodlesRepository;

    public NoodlesJpaService(NoodlesRepository noodlesRepository) {
        this.noodlesRepository = noodlesRepository;
    }

    @Override
    public Set<Noodles> findAll() {
        Set<Noodles> noodles = new HashSet<>();
        noodlesRepository.findAll().forEach(noodles::add);
        return noodles;
    }

    @Override
    public Noodles findById(Long id) {
        return null;
    }

    @Override
    public Noodles save(Noodles object) {
        return null;
    }

    @Override
    public void delete(Noodles object) {
        noodlesRepository.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        noodlesRepository.deleteById(id);
    }
}
