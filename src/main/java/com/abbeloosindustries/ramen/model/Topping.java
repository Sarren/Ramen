package com.abbeloosindustries.ramen.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "Toppings")
public class Topping extends BaseEntity{

    @Column(name = "Name")
    private String name;

    @Column(name = "Quantity")
    private int quantity;

    /*@ManyToMany
    @JoinTable(name = "Toppings for ramen")
    private Ramen ramen;*/

    @Builder
    public Topping(Long id, String name, int quantity) {
        super(id);
        this.name = name;
        this.quantity = quantity;
    }
}
