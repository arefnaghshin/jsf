package com.example.jsf;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String name;

    @Column
    private BigDecimal price;

    protected Product() {
    }

    public Product(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }
}
