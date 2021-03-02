package com.abbeloosindustries.ramen.model;

import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Entity
@Table(name = "Toppings")
public class Topping extends BaseEntity{

    @Column(name = "Name")
    private String name;

    @Column(name = "Quantity")
    private int quantity;

    @ManyToMany
    @JoinTable(name = "Toppings for ramen")
    private Ramen ramen;

    public Topping(Long id, String name, int quantity) {
        super(id);
        this.name = name;
        this.quantity = quantity;
    }
}
