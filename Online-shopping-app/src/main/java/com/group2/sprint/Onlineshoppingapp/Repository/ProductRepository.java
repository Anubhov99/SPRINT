package com.group2.sprint.Onlineshoppingapp.Repository;

import com.group2.sprint.Onlineshoppingapp.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, String>
{
}
