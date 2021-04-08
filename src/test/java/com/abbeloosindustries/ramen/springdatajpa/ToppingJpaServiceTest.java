package com.abbeloosindustries.ramen.springdatajpa;

import com.abbeloosindustries.ramen.model.Topping;
import com.abbeloosindustries.ramen.repositories.ToppingRepository;
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
class ToppingJpaServiceTest {

    @Mock
    private ToppingRepository toppingRepository;

    @InjectMocks
    private ToppingJpaService toppingJpaService;

    @Test
    public void test_if_set_of_toppings_is_created_correctly(){
        Set<Topping> toppingSet = new HashSet<>();
        toppingSet.add(Topping.builder().id(1L).build());
        toppingSet.add(Topping.builder().id(2L).build());

        when(toppingRepository.findAll()).thenReturn(toppingSet);
        Set<Topping> toppings = toppingJpaService.findAll();

        assertNotNull(toppings);
        assertEquals(2, toppings.size());
    }
}