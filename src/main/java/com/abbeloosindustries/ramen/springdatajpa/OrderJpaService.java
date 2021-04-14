package com.abbeloosindustries.ramen.springdatajpa;

//import com.abbeloosindustries.ramen.model.Order;
import com.abbeloosindustries.ramen.model.Order;
import com.abbeloosindustries.ramen.repositories.OrderRepository;
import com.abbeloosindustries.ramen.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("SpringDataJpa")
public class OrderJpaService implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public OrderJpaService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public Set<Order> findAll() {
        Set<Order> orderSet = new HashSet<>();
        orderRepository.findAll().forEach(orderSet::add);
        return orderSet;
    }

    @Override
    public Order findById(Long aLong) {
        return orderRepository.findById(aLong).orElse(null);
    }

    @Override
    public Order save(Order object) {
        return orderRepository.save(object);
    }

    @Override
    public void delete(Order object) {

    }

    @Override
    public void deleteById(Long aLong) {

    }
}
