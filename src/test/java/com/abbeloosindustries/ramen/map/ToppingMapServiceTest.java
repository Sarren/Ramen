package com.abbeloosindustries.ramen.map;

import com.abbeloosindustries.ramen.model.Noodles;
import com.abbeloosindustries.ramen.model.Topping;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class ToppingMapServiceTest {
    private ToppingMapService toppingMapService;

    final Long OWNERID = 1L;

    @BeforeEach
    void setUp() {
        // By using the mapService the Service  Interface is autowired, so no need for mocks here
        toppingMapService = new ToppingMapService();
        toppingMapService.save(Topping.builder().id(OWNERID).build());
    }

    @Test
    void test_if_findall_method_returns_set() {
        Set<Topping> toppingSet = toppingMapService.findAll();
        assertEquals(OWNERID, toppingSet.size());
    }

}