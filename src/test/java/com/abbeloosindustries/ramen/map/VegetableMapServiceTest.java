package com.abbeloosindustries.ramen.map;

import com.abbeloosindustries.ramen.model.Noodles;
import com.abbeloosindustries.ramen.model.Vegetable;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class VegetableMapServiceTest {
    private VegetableMapService vegetableMapService;

    final Long OWNERID = 1L;

    @BeforeEach
    void setUp() {
        // By using the mapService the Service  Interface is autowired, so no need for mocks here
        vegetableMapService = new VegetableMapService();
        vegetableMapService.save(Vegetable.builder().id(OWNERID).build());
    }

    @Test
    void findAll() {
        Set<Vegetable> vegetableSet = vegetableMapService.findAll();
        assertEquals(OWNERID, vegetableSet.size());
    }
}