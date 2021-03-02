package com.abbeloosindustries.ramen.model;

import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@NoArgsConstructor
@Entity
@Table(name = "Broth")
public class Broth extends BaseEntity {

    @Column(name = "Type")
    private String type;

    @Column(name = "Quantity")
    private int quantity;

    public Broth(Long id, String type, int quantity) {
        super(id);
        this.type = type;
        this.quantity = quantity;
    }
}
