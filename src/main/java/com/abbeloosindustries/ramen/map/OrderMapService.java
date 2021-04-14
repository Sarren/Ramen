package com.abbeloosindustries.ramen.map;

import com.abbeloosindustries.ramen.model.Order;
import com.abbeloosindustries.ramen.services.OrderService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Profile({"default", "map"})
public class OrderMapService extends AbstractMapService<Order, Long> implements OrderService {
    @Override
    public Set<Order> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public Order save(Order order) {
        return super.save(order);
    }

    @Override
    public void delete(Order order) {

    }

    @Override
    public Order findById(Long id) {
        return super.findById(id);
    }
}
