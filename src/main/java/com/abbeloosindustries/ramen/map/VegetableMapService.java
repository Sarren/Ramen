package com.abbeloosindustries.ramen.services.map;

import com.abbeloosindustries.ramen.model.Vegetable;
import com.abbeloosindustries.ramen.services.VegetableService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
@Profile({"default", "map"})
public class VegetableMapService extends AbstractMapService<Vegetable, Long> implements VegetableService {
    @Override
    public Set<Vegetable> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public void delete(Vegetable object) {

    }

    @Override
    public Vegetable save(Vegetable object) {
        return super.save(object);
    }

    @Override
    public Vegetable findById(Long id) {
        return null;
    }
}
