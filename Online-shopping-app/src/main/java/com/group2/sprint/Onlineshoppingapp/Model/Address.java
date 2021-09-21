package com.group2.sprint.Onlineshoppingapp.Model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "cust_address")
public class Address {
    @Id
    @Column(name = "id", nullable = false)
    private Integer addressId;
    private String streetNo;
    private String buildingName;
    private String city;
    private String state;
    private String country;
    private String pincode;

}
