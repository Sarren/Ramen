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
public class Ramen extends BaseEntity{

    private String name;
    private int quantity;
    private Broth broth;
    private Topping topping;
    private Vegetable vegetable;
    private MeatNoMeat meatNoMeat;
    @ManyToOne
    private Order order;

    @Builder
    public Ramen(Long id, String name, int quantity, Broth broth, Topping topping, Vegetable vegetable,
                 MeatNoMeat meatNoMeat, Order order) {
        super(id);
        this.name = name;
        this.quantity = quantity;
        this.broth = broth;
        this.topping = topping;
        this.vegetable = vegetable;
        this.meatNoMeat = meatNoMeat;
        this.order = order;
    }

    @Override
    public String toString() {
        return "Ramen{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                ", broth=" + broth +
                ", topping=" + topping +
                ", vegetable=" + vegetable +
                ", meatNoMeat=" + meatNoMeat +
                ", order=" + order +
                '}';
    }
}
