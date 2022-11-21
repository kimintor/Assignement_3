package com.example.assignmentproj.repository;

import com.example.assignmentproj.model.Animal;
import com.example.assignmentproj.model.Date;

import java.util.List;

public interface IAnimalRepository {

    public Animal save(Animal a);
    public Animal findByRegNumber(long regNumber);
    public Animal update(Animal a);
    public void deleteByRegNumber(long regNumber);
    public List<Animal> findAll();
    public List<Animal>findByDate(Date date);
    public List<Animal> findByOrigin(String origin);



}
