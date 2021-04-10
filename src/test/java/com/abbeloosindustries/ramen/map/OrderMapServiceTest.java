package com.abbeloosindustries.ramen.map;

import com.abbeloosindustries.ramen.model.Order;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class OrderMapServiceTest {

    private OrderMapService orderMapService;
    private Long orderrId = 1L;

    @BeforeEach
    void setUp(){
        orderMapService = new OrderMapService();
        orderMapService.save(Order.builder().id(orderrId).build());
    }

    @Test
    public void test_if_findall_method_returns_set(){
        Set<Order> orderSet = orderMapService.findAll();
        assertEquals(orderrId, orderSet.size());
    }
}
