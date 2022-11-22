package com.example.assignmentproj.grpcImplementation;

import com.example.assignmentproj.model.Animal;
import com.example.assignmentproj.model.Date;
import protobuff.ComunicatorOuterClass.protoAnimal;
import protobuff.ComunicatorOuterClass.protoDate;
import protobuff.ComunicatorOuterClass.protoListAnimals;

import java.util.ArrayList;
import java.util.List;

public class ObjectTranslator {

    private static ObjectTranslator instance  = null;
    private ObjectTranslator(){

    }
    public static synchronized ObjectTranslator getInstance() {
        if (instance==null){
            instance= new ObjectTranslator();
        }
        return instance;
    }

    /**
     *
     * // NB this is a set repeated field in proto
     * Test.Builder b = Test.newBuilder();
     *
     * for (i = 0; i < somearr.size(); i++) {
     *     float x = getX; // somehow?
     *     float y = getY; // ??
     *     b.addPoint(Point.newBuilder().setX(x).setY(y).build());
     * }
     *
     * Test mytest = b.build();
     * @param animal
     * @return
     */

    public protoAnimal getProtoAnimal(Animal animal){
        protoDate date = protoDate.newBuilder().setDay(animal.getArrivalDate().getDay())
                .setMonth(animal.getArrivalDate().getMonth())
                .setYear(animal.getArrivalDate().getYear()).build();
        System.out.println(date.getDay()+"-"+date.getMonth()+"-"+date.getYear());
        protoAnimal result = protoAnimal.newBuilder().setDate(date)
                .setOrigin(animal.getOrigin())
                .setRegNumber(animal.getRegNumber())
                .setWight(animal.getWeight()).build();

   return result;
    }

    public Animal getAnimalFromProto(protoAnimal protoAnimal){
        Date date = new Date(protoAnimal.getDate().getYear(),protoAnimal.getDate().getMonth(),protoAnimal.getDate().getDay());
        Animal result = new Animal(date,protoAnimal.getWight(),protoAnimal.getRegNumber(),protoAnimal.getOrigin());

        return result;
    }
    public static Animal getAnimalFromStatic(protoAnimal protoAnimal){
        Date date = new Date(protoAnimal.getDate().getYear(),protoAnimal.getDate().getMonth(),protoAnimal.getDate().getDay());
        Animal result = new Animal(date,protoAnimal.getWight(),protoAnimal.getRegNumber(),protoAnimal.getOrigin());

        return result;
    }

    public List<Animal> getListFromProto(protoListAnimals protoListAnimals){
        List<Animal> result = new ArrayList<>();
        for (int i = 0;i<protoListAnimals.getAnimalsCount();i++){
            result.add(getAnimalFromProto(protoListAnimals.getAnimals(i)));
        }
        return result;

    }
}
