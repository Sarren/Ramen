package com.abbeloosindustries.ramen.services.map;

import com.abbeloosindustries.ramen.model.Noodles;
import com.abbeloosindustries.ramen.services.Noodleservice;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Profile({"default", "map"})
public class NoodlesMapService extends AbstractMapService<Noodles, Long> implements Noodleservice {
    @Override
    public Set<Noodles> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public void delete(Noodles object) {

    }

    @Override
    public Noodles save(Noodles object) {
        return super.save(object);
    }

    @Override
    public Noodles findById(Long id) {
        return null;
    }
}
