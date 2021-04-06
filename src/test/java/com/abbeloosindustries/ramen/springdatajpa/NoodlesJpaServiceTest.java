package com.abbeloosindustries.ramen.services.springdatajpa;

import com.abbeloosindustries.ramen.model.Noodles;
import com.abbeloosindustries.ramen.repositories.NoodlesRepository;
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
class NoodlesJpaServiceTest {

    @Mock
    private NoodlesRepository noodlesRepository;

    @InjectMocks
    private NoodlesJpaService noodlesJpaService;

    @Test
    public void test_if_set_of_noodles_is_created_correctly(){
        Set<Noodles> noodlesSet = new HashSet<>();
        noodlesSet.add(Noodles.builder().id(1L).build());
        noodlesSet.add(Noodles.builder().id(2L).build());

        when(noodlesRepository.findAll()).thenReturn(noodlesSet);
        Set<Noodles> noodles = noodlesJpaService.findAll();

        assertNotNull(noodles);
        assertEquals(2, noodles.size());

    }
}