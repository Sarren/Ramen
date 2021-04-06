package com.abbeloosindustries.ramen.services.map;

import com.abbeloosindustries.ramen.model.Broth;
import com.abbeloosindustries.ramen.services.BrothService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Profile({"default", "map"})
public class BrothMapService extends AbstractMapService<Broth, Long> implements BrothService {
    @Override
    public Broth findBrothByType(String type) {
        return null;
    }

    @Override
    public Set<Broth> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public void delete(Broth object) {

    }

    @Override
    public Broth save(Broth object) {
        return super.save(object);
    }

    @Override
    public Broth findById(Long id) {
        return null;
    }
}
