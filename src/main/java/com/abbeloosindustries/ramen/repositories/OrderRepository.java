package com.abbeloosindustries.ramen.repositories;

//import com.abbeloosindustries.ramen.model.Order;
import com.abbeloosindustries.ramen.model.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long> {
}
