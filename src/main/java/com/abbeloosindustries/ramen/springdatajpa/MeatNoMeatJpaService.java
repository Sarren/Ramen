package com.abbeloosindustries.ramen.springdatajpa;

import com.abbeloosindustries.ramen.model.MeatNoMeat;
import com.abbeloosindustries.ramen.repositories.MeatNoMeatRepository;
import com.abbeloosindustries.ramen.services.MeatNoMeatService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("SpringDataJpa")
public class MeatNoMeatJpaService implements MeatNoMeatService {

    private MeatNoMeatRepository meatNoMeatRepository;

    public MeatNoMeatJpaService(MeatNoMeatRepository meatNoMeatRepository) {
        this.meatNoMeatRepository = meatNoMeatRepository;
    }

    @Override
    public Set<MeatNoMeat> findAll() {
        Set<MeatNoMeat> meatNoMeatSet = new HashSet<>();
        meatNoMeatRepository.findAll().forEach(meatNoMeatSet::add);
        return meatNoMeatSet;
    }

    @Override
    public MeatNoMeat findById(Long aLong) {
        return null;
    }

    @Override
    public MeatNoMeat save(MeatNoMeat object) {
        return null;
    }

    @Override
    public void delete(MeatNoMeat object) {

    }

    @Override
    public void deleteById(Long aLong) {

    }
}
