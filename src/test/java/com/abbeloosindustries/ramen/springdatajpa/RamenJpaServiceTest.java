package com.abbeloosindustries.ramen.springdatajpa;

import com.abbeloosindustries.ramen.model.Ramen;
import com.abbeloosindustries.ramen.repositories.RamenRepository;
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
class RamenJpaServiceTest {

    @Mock
    private RamenRepository ramenRepository;

    @InjectMocks
    private RamenJpaService ramenJpaService;

    @Test
    public void test_if_set_of_ramen_is_created_correctly(){
        Set<Ramen> ramenSet = new HashSet<>();
        ramenSet.add(Ramen.builder().id(1L).build());
        ramenSet.add(Ramen.builder().id(2L).build());

        when(ramenRepository.findAll()).thenReturn(ramenSet);
        Set<Ramen> ramen = ramenJpaService.findAll();

        assertNotNull(ramen);
        assertEquals(2, ramen.size());
    }
}