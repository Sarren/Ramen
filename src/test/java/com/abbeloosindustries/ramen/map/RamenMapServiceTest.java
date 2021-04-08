package com.abbeloosindustries.ramen.map;

import com.abbeloosindustries.ramen.model.Noodles;
import com.abbeloosindustries.ramen.model.Ramen;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class RamenMapServiceTest {

    private RamenMapService ramenMapService;

    final Long OWNERID = 1L;

    @BeforeEach
    void setUp() {
        // By using the mapService the Service  Interface is autowired, so no need for mocks here
        ramenMapService = new RamenMapService();
        ramenMapService.save(Ramen.builder().id(OWNERID).build());
    }

    @Test
    void findAll() {
        Set<Ramen> ramenSet = ramenMapService.findAll();
        assertEquals(OWNERID, ramenSet.size());
    }
}