package com.abbeloosindustries.ramen.model;

import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@NoArgsConstructor
@Entity
@Table(name = "Noodles")
public class Noodles extends BaseEntity{

    @Column(name = "Name")
    private String name;

    @Column(name = "Quantity")
    private int quantity;

    public Noodles(Long id, String name, int quantity) {
        super(id);
        this.name = name;
        this.quantity = quantity;
    }
}
