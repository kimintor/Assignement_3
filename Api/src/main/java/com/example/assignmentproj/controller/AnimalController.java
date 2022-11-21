package com.example.assignmentproj.controller;

import com.example.assignmentproj.model.Animal;
import com.example.assignmentproj.model.Date;
import com.example.assignmentproj.repository.AnimalRepository0;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AnimalController {


    private AnimalRepository0 animalRepo;

    public AnimalController (AnimalRepository0 animalRepo){
        this.animalRepo= animalRepo;
    }

    @RequestMapping(value = "/animals/{regNumber}",method = RequestMethod.GET,
    produces =  {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
    @ResponseBody
    public Animal getAnimalByRegNumber(@PathVariable Long regNumber){
        return animalRepo.findByRegNumber(regNumber);
    }

    @RequestMapping(value = "/animals/all",
    method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List<Animal> getAllAnimals(){
        List<Animal> result = animalRepo.findAll();
        return result;
    }

    @RequestMapping(value = "/animals",
    method = RequestMethod.POST)
    @ResponseBody
    public void registerAnimal(@RequestBody Animal animal){

         animalRepo.save(animal);
    }

    // get by date
   @GetMapping("/animals/date")
    @ResponseBody
    public List<Animal> getAnimalByDate(@RequestParam(value = "year") int year,@RequestParam(value = "month") int month,@RequestParam(value = "day") int day){
        Date date = new Date(year,month,day);
        return animalRepo.findByDate(date);
    }

    // get by origin

    @GetMapping("/animals")
    @ResponseBody
    public List<Animal> getAnimalByOrigin(@RequestParam(value = "origin") String origin){
        List<Animal> result = animalRepo.findByOrigin(origin);
        return result;
    }
}
