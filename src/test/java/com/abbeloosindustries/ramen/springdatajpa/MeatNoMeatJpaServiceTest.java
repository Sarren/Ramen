package com.abbeloosindustries.ramen.springdatajpa;

import com.abbeloosindustries.ramen.model.MeatNoMeat;
import com.abbeloosindustries.ramen.repositories.MeatNoMeatRepository;
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
class MeatNoMeatJpaServiceTest {

    @Mock
    private MeatNoMeatRepository meatNoMeatRepository;

    @InjectMocks
    private MeatNoMeatJpaService meatNoMeatJpaService;

    @Test
    public void test_if_set_of_meat_is_created_correctly(){
        Set<MeatNoMeat> meatSet = new HashSet<>();
        meatSet.add(MeatNoMeat.builder().id(1L).build());
        meatSet.add(MeatNoMeat.builder().id(2L).build());

        when(meatNoMeatRepository.findAll()).thenReturn(meatSet);
        Set<MeatNoMeat> meats = meatNoMeatJpaService.findAll();

        assertNotNull(meats);
        assertEquals(2, meats.size());
    }
}