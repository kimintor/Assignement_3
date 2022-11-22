package com.example.assignmentproj.repository;

import com.example.assignmentproj.model.Animal;
import com.example.assignmentproj.model.Product;

import java.util.List;


public interface IProductRepostory {
    public List<Animal> getAnimalsInProduct(int productId);
    public List<Long> getAnimalsRegNumberInProduct (int productId);
    public List<Product> getAllProductsFromAnimalRegNumber(long regNumber);

    public List<Product> findAllProducts ();
}
