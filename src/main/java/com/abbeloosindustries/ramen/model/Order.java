package com.abbeloosindustries.ramen.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "Noodles")
public class Order extends BaseEntity{

    @Column(name = "Name")
    private String name;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "order")
    private Set<Ramen> ramenSet = new HashSet<>();

    @Builder
    public Order(Long id, String name) {
        super(id);
        this.name = name;
    }
}
