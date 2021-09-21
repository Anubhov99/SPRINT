package com.group2.sprint.Onlineshoppingapp.Model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Map;

@Data
@NoArgsConstructor
@Entity
@Table(name = "cust_order")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String orderId;
    private LocalDate orderDate;
    private String orderStatus;
    private Customer customer;
    private Map<Integer,String> productList;
    private Address address;
}
