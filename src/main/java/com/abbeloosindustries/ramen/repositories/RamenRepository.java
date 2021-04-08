package com.abbeloosindustries.ramen.repositories;

import com.abbeloosindustries.ramen.model.Ramen;
import org.springframework.data.repository.CrudRepository;

public interface RamenRepository extends CrudRepository<Ramen, Long> {
}
