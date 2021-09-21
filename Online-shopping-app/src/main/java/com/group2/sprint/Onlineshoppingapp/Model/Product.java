package com.group2.sprint.Onlineshoppingapp.Model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "abc_product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String productId;
    private String productName;
    private double price;
    private String color;
    private String dimension;
    private String specification;
    private String manufacturer;
    private int quantity;

    @OneToOne(targetEntity = Category.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "cp_fk", referencedColumnName = "id")
    private Category category;
}
