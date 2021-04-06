package com.abbeloosindustries.ramen.services.springdatajpa;

import com.abbeloosindustries.ramen.model.Vegetable;
import com.abbeloosindustries.ramen.repositories.VegetableRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class VegetableMapJpaTest {

    @Mock
    private VegetableRepository vegetableRepository;

    @InjectMocks
    private VegetableMapJpaService vegetableMapJpaService;

    @Test
    public void test_if_set_of_vegetables_is_created_correctly(){
        Set<Vegetable> vegetableSet = new HashSet<>();
        vegetableSet.add(Vegetable.builder().id(1L).build());
        vegetableSet.add(Vegetable.builder().id(2L).build());

        when(vegetableRepository.findAll()).thenReturn(vegetableSet);
        Set<Vegetable> vegetables = vegetableMapJpaService.findAll();

        assertNotNull(vegetables);
        assertEquals(2, vegetables.size());
    }

}