package com.abbeloosindustries.ramen.map;

import com.abbeloosindustries.ramen.model.MeatNoMeat;
import com.abbeloosindustries.ramen.services.MeatNoMeatService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
@Profile({"default", "map"})
public class MeatNoMeatMapService extends AbstractMapService<MeatNoMeat, Long> implements MeatNoMeatService {

    @Override
    public Set<MeatNoMeat> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public void delete(MeatNoMeat object) {

    }

    @Override
    public MeatNoMeat save(MeatNoMeat object) {
        return super.save(object);
    }

    @Override
    public MeatNoMeat findById(Long id) {
        return null;
    }
}
