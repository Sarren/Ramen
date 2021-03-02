package com.abbeloosindustries.ramen.model;

import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@NoArgsConstructor
@Entity
@Table(name = "Ramen")
public class Ramen extends BaseEntity{

    @Column(name = "Ramen")
    private String ramenName;

    @Column(name = "Quantity")
    private int quantity;

    @Column(name = "Broth")
    private Broth broth;

    @Column(name = "Topping")
    private Topping topping;

    @Column(name = "Vegetables")
    private Vegatable vegatable;

    public Ramen(Long id, String ramenName, int quantity, Broth broth, Topping topping, Vegatable vegatable) {
        super(id);
        this.ramenName = ramenName;
        this.quantity = quantity;
        this.broth = broth;
        this.topping = topping;
        this.vegatable = vegatable;
    }
}
