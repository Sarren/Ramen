package com.abbeloosindustries.ramen.model;

import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@NoArgsConstructor
@Entity
@Table(name = "Vegetables")
public class Vegatable extends BaseEntity{

    @Column(name = "Name")
    private String name;

    @Column(name = "Quantity")
    private int quantity;

    public Vegatable(Long id, String name, int quantity) {
        super(id);
        this.name = name;
        this.quantity = quantity;
    }
}
