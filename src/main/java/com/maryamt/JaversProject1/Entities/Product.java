package com.maryamt.JaversProject1.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Product")
public class Product {
    @Id
    @GeneratedValue
    private int product_id;
    private String name;
    private float price;
    @ManyToOne
    @JoinColumn(name = "store_id")
    private Store store;

}
