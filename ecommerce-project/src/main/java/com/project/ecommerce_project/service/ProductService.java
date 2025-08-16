package com.project.ecommerce_project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.ecommerce_project.model.Product;
import com.project.ecommerce_project.repository.ProductRepo;

@Service
public class ProductService {
    @Autowired
    private ProductRepo repo;


    public List<Product> getAllProducts(){
       return repo.findAll();
    }


    public  Product getProductById(int id){
        return repo.findById(id).get();
    }

}
