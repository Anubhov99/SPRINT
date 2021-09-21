package com.group2.sprint.Onlineshoppingapp.Model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "abc_category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String cartId;
    private String categoryName;
}
