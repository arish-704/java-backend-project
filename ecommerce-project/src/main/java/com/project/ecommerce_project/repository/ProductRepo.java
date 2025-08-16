package com.project.ecommerce_project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.ecommerce_project.model.Product;
@Repository
public interface ProductRepo extends JpaRepository<Product , Integer> {

}
