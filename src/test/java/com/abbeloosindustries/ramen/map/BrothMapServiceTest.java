package com.abbeloosindustries.ramen.map;

import com.abbeloosindustries.ramen.model.Broth;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class BrothMapServiceTest {
    private BrothMapService brothMapService;

    final Long OWNERID = 1L;
    final String name = "Chicken broth";

    @BeforeEach
    void setUp() {
        // By using the mapService the Service  Interface is autowired, so no need for mocks here
        brothMapService = new BrothMapService();
        brothMapService.save(Broth.builder().id(OWNERID).build());
    }

    @Test
    void test_if_findall_method_returns_set() {
        Set<Broth> ownerSet = brothMapService.findAll();
        assertEquals(OWNERID, ownerSet.size());
    }
}