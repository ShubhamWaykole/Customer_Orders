package com.workspace.customerorders.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;

@Entity
@Getter
@Setter
public class Item implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "item_id")
    private Long Id;

    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "items")
    @JsonIgnore
    private Set<Customer> customers;

    private String item;
    private Integer price;
    private Integer qty;
}
