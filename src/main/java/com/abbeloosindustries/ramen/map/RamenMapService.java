package com.abbeloosindustries.ramen.map;

import com.abbeloosindustries.ramen.model.Ramen;
import com.abbeloosindustries.ramen.services.RamenService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Profile({"default", "map"})
public class RamenMapService extends AbstractMapService<Ramen, Long> implements RamenService {
    @Override
    public Set<Ramen> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public void delete(Ramen object) {

    }

    @Override
    public Ramen save(Ramen object) {
        return super.save(object);
    }

    @Override
    public Ramen findById(Long id) {
        return null;
    }
}
