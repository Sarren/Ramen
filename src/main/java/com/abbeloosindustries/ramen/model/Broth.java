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
@Table(name = "Broth")
public class Broth extends BaseEntity {

    @Column(name = "Type")
    private String type;

    @Column(name = "Quantity")
    private int quantity;

    @Builder
    public Broth(Long id, String type, int quantity) {
        super(id);
        this.type = type;
        this.quantity = quantity;
    }
}
