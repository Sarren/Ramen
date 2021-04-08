package com.abbeloosindustries.ramen.map;

import com.abbeloosindustries.ramen.model.Broth;
import com.abbeloosindustries.ramen.model.MeatNoMeat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class MeatNoMeatMapServiceTest {
    private MeatNoMeatMapService meatNoMeatMapService;

    final Long OWNERID = 1L;
    final String name = "Meat";

    @BeforeEach
    void setUp() {
        // By using the mapService the Service  Interface is autowired, so no need for mocks here
        meatNoMeatMapService = new MeatNoMeatMapService();
        meatNoMeatMapService.save(MeatNoMeat.builder().id(OWNERID).build());
    }

    @Test
    void findAll() {
        Set<MeatNoMeat> meatSet = meatNoMeatMapService.findAll();
        assertEquals(OWNERID, meatSet.size());
    }

}