package com.example.assignmentproj.controller;

import com.example.assignmentproj.model.Animal;
import com.example.assignmentproj.model.Product;
import com.example.assignmentproj.repository.IProductRepostory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    private IProductRepostory repo;

    public ProductController (IProductRepostory repo ){
        this.repo = repo;
    }

    @RequestMapping(value = "/products/all",
            method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List<Product> getAllAnimals(){
        List<Product> result = repo.findAllProducts();
        return result;
    }

    @RequestMapping (value = "product/animals/{productId}",
            method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List<Animal> getAnimalsInProduct(@PathVariable int productId){
        List<Animal> result = repo.getAnimalsInProduct(productId);
        return result;
    }

    @RequestMapping(value = "/products/fromAnimal/{animalId}",
            method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List<Product> getAllAnimals(@PathVariable int animalId){
        List<Product> result = repo.getAllProductsFromAnimalRegNumber(animalId);
        return result;
    }

    @RequestMapping (value = "product/AnimalRegNumber/{productId}",
            method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List<Long> getAnimalRegNumbersInProduct(@PathVariable int productId){
        List<Long> result = repo.getAnimalsRegNumberInProduct(productId);
        return result;
    }
}
