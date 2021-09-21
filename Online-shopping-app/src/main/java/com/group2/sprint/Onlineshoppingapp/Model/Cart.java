package com.group2.sprint.Onlineshoppingapp.Model;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Map;

@Data
@NoArgsConstructor
@Entity
@Table(name = "cust_cart")
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String cartId;
    private Customer customer;
    private Map<Integer,String> productList;
}
