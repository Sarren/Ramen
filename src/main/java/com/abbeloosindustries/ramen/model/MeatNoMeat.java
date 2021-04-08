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
@Table(name = "MeatNoMeat")
public class MeatNoMeat extends BaseEntity{

    @Column(name = "Name")
    private String name;

    @Column(name = "Quantity")
    private int quantity;

    @Builder
    public MeatNoMeat(Long id, String name, int quantity) {
        super(id);
        this.name = name;
        this.quantity = quantity;
    }
}
