package com.abbeloosindustries.ramen.map;

import com.abbeloosindustries.ramen.model.MeatNoMeat;
import com.abbeloosindustries.ramen.model.Noodles;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class NoodlesMapServiceTest {
    private NoodlesMapService noodlesMapService;

    final Long OWNERID = 1L;

    @BeforeEach
    void setUp() {
        // By using the mapService the Service  Interface is autowired, so no need for mocks here
        noodlesMapService = new NoodlesMapService();
        noodlesMapService.save(Noodles.builder().id(OWNERID).build());
    }

    @Test
    void findAll() {
        Set<Noodles> noodlesSet = noodlesMapService.findAll();
        assertEquals(OWNERID, noodlesSet.size());
    }
}