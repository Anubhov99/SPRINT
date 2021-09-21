package com.group2.sprint.Onlineshoppingapp.Model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Table(name = "abc_customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String customerId;
    @Size(min = 2, max = 20)
    @NotNull(message = "Pls Enter First Name!")
    private String firstName;
    @Size(min = 2, max = 20)
    @NotNull(message = "Pls Enter Last Name!")
    private String lastName;
    @NotNull(message = "Pls Enter Full Address!")
    private Address address;
    @NotNull(message = "Pls Enter Email")
    @Email
    private String email;
    @NotNull
    private String mobile;

    @OneToOne(targetEntity = Address.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "cp_fk", referencedColumnName = "id")

    private List<Address> addressList;

}
