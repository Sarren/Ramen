package com.abbeloosindustries.ramen.repositories;

import com.abbeloosindustries.ramen.model.Vegetable;
import org.springframework.data.repository.CrudRepository;

public interface VegetableRepository extends CrudRepository<Vegetable, Long> {
}
