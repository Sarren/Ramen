package com.abbeloosindustries.ramen.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "Ramen")
public class Ramen extends BaseEntity{

    @Column(name = "Ramen")
    private String name;

    @Column(name = "Quantity")
    private int quantity;

    @Column(name = "Broth")
    private Broth broth;

    @Column(name = "Topping")
    private Topping topping;

    @Column(name = "Vegetables")
    private Vegetable vegetable;

    @Column(name = "Meat")
    private MeatNoMeat meatNoMeat;

    @Builder
    public Ramen(Long id, String name, int quantity, Broth broth, Topping topping, Vegetable vegetable,
                 MeatNoMeat meatNoMeat) {
        super(id);
        this.name = name;
        this.quantity = quantity;
        this.broth = broth;
        this.topping = topping;
        this.vegetable = vegetable;
        this.meatNoMeat = meatNoMeat;
    }
}
