package Persistance;

import model.Animal;
import model.Date;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class TestRepo  {


    private static TestRepo instance;
    private static final Map<Long, Animal> animalMap = new HashMap<>();

    public static synchronized TestRepo getInstance()  {
        if (instance==null){
            instance= new TestRepo();
        }
        return instance;
    }


    public Animal save(Animal a) {
        animalMap.put(a.getRegNumber(),a);

        System.out.println(a.getRegNumber()+"Origin::"+a.getOrigin());
        return a;

    }


    public Animal getByRegNumber(long regNumber) {

        System.out.println("in test repo "+ regNumber);
        Date date = new Date(1200,12,20);
        Animal result =  new Animal(date,12.90,regNumber,"origin","sepcies");
        return result;
    }
}
