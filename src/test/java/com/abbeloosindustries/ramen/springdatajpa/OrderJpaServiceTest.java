package com.abbeloosindustries.ramen.springdatajpa;

import com.abbeloosindustries.ramen.model.Order;
import com.abbeloosindustries.ramen.repositories.OrderRepository;
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
class OrderJpaServiceTest {

    @Mock
    private OrderRepository orderRepository;

    @InjectMocks
    private OrderJpaService orderJpaService;

    @Test
    public void test_if_set_of_orders_is_created_correctly(){
        Set<Order> orderSet = new HashSet<>();
        orderSet.add(Order.builder().id(1L).build());
        orderSet.add(Order.builder().id(2L).build());

        when(orderRepository.findAll()).thenReturn(orderSet);
        Set<Order> orders = orderJpaService.findAll();

        assertNotNull(orderSet);
        assertEquals(2, orders.size());
    }
}