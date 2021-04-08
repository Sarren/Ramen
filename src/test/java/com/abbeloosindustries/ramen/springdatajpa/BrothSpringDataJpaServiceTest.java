package com.abbeloosindustries.ramen.springdatajpa;

import com.abbeloosindustries.ramen.model.Broth;
import com.abbeloosindustries.ramen.repositories.BrothRepository;
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
class BrothSpringDataJpaServiceTest {

    @Mock
    private BrothRepository brothRepository;

    @InjectMocks
    private BrothSpringDataJpaService brothSpringDataJpaService;

    @Test
    void test_if_set_of_broths_is_created_correctly() {

        Set<Broth> returnOwnerSet = new HashSet<>();
        returnOwnerSet.add(Broth.builder().id(1L).build());
        returnOwnerSet.add(Broth.builder().id(2L).build());

        when(brothRepository.findAll()).thenReturn(returnOwnerSet);
        Set<Broth> broths = brothSpringDataJpaService.findAll();

        assertNotNull(broths);
        assertEquals(2, broths.size());
    }
}