package com.abbeloosindustries.ramen.springdatajpa;

import com.abbeloosindustries.ramen.model.Broth;
import com.abbeloosindustries.ramen.repositories.BrothRepository;
import com.abbeloosindustries.ramen.services.BrothService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
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
        Broth foundBroth = new Broth();
        foundBroth.setType("test");
        Iterable<Broth> brothSet = brothRepository.findAll();
        for (Broth broth : brothSet) {
            if (broth.getType().equalsIgnoreCase(type)){
                foundBroth = broth;
            }
        }
        return foundBroth ;
    }

    @Override
    public Set<Broth> findAll() {
        Set <Broth> setOfBroths = new HashSet<>();
        brothRepository.findAll().forEach(setOfBroths::add);
        return setOfBroths;
    }

    @Override
    public Broth findById(Long aLong) {
        Optional<Broth> broth = brothRepository.findById(aLong);
        return broth.orElse(new Broth());
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
