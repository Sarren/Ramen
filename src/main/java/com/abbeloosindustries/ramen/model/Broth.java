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
public class Broth extends BaseEntity {

    private String type;

    private int quantity;

    private double price;

    @Builder
    public Broth(Long id, String type, int quantity, double price) {
        super(id);
        this.type = type;
        this.quantity = quantity;
        this.price = price;
    }
}
