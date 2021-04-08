package com.abbeloosindustries.ramen.services;

import com.abbeloosindustries.ramen.model.Broth;

import java.util.Set;

public interface BrothService extends CrudService<Broth, Long> {
    Broth findBrothByType(String type);
}
