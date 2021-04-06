package com.abbeloosindustries.ramen.services.springdatajpa;

import com.abbeloosindustries.ramen.model.Broth;
import com.abbeloosindustries.ramen.repositories.BrothRepository;
import com.abbeloosindustries.ramen.services.BrothService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class BrothSpringDataJpaService implements BrothService {

    private final BrothRepository brothRepository;

    public BrothSpringDataJpaService(BrothRepository brothRepository) {
        this.brothRepository = brothRepository;
    }

    @Override
    public Broth findBrothByType(String type) {
        return brothRepository.findBrothByType(type);
    }

    @Override
    public Set<Broth> findAll() {
        Set <Broth> setOfBroths = new HashSet<>();
        brothRepository.findAll().forEach(setOfBroths::add);
        return setOfBroths;
    }

    @Override
    public Broth findById(Long aLong) {
        return null;
    }

    @Override
    public Broth save(Broth object) {
        return brothRepository.save(object);
    }

    @Override
    public void delete(Broth object) {

    }

    @Override
    public void deleteById(Long aLong) {

    }
}
