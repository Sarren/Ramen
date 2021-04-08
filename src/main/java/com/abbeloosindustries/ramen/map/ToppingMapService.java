package com.abbeloosindustries.ramen.map;

import com.abbeloosindustries.ramen.model.Topping;
import com.abbeloosindustries.ramen.services.ToppingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Profile({"default", "map"})
public class ToppingMapService extends AbstractMapService<Topping, Long> implements ToppingService {
    @Override
    public Set<Topping> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public void delete(Topping object) {

    }

    @Override
    public Topping save(Topping object) {
        return super.save(object);
    }

    @Override
    public Topping findById(Long id) {
        return null;
    }
}
