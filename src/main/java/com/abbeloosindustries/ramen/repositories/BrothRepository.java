package com.abbeloosindustries.ramen.repositories;

import com.abbeloosindustries.ramen.model.Broth;
import org.springframework.data.repository.CrudRepository;

public interface BrothRepository extends CrudRepository<Broth, Long> {

    Broth findBrothByType(String type);
}
