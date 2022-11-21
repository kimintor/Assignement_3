package specificBuilder;

import model.Animal;
import model.Date;
import protobuff.ComunicatorOuterClass;

public class SpecBuilder {

    private static SpecBuilder instance;

    private SpecBuilder(){

    }

    public static SpecBuilder getInstance(){
        if (instance ==null){
          instance  = new SpecBuilder();
        }
        return instance;
    }

    public ComunicatorOuterClass.protoDate buildDate(Date date){
        ComunicatorOuterClass.protoDate result =  ComunicatorOuterClass.protoDate.newBuilder()
                .setYear(date.getYear())
                .setMonth(date.getMonth())
                .setDay(date.getDay()).build();
        return result;
    }
    public static ComunicatorOuterClass.protoDate buildDateStatic(Date date){
        return ComunicatorOuterClass.protoDate.newBuilder()
                .setYear(date.getYear())
                .setMonth(date.getMonth())
                .setDay(date.getDay()).build();
    }


    public  ComunicatorOuterClass.protoAnimal buildAnimal(Animal animal){
         ComunicatorOuterClass.protoAnimal result =  ComunicatorOuterClass.protoAnimal.newBuilder()
                .setDate(buildDate(animal.getArrivalDate()))
                .setWight(animal.getWeight())
                .setOrigin(animal.getOrigin())
                .setRegNumber(animal.getRegNumber())
                .build();

         return result;

    }
}
