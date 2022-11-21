package ComunicatorImp;

import Persistance.AnimalDao;
import Persistance.IAnimalDao;
import Persistance.TestRepo;
import io.grpc.stub.StreamObserver;
import model.Animal;



import model.Date;
import protobuff.*;
import specificBuilder.SpecBuilder;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class ComunicatorImp extends ComunicatorGrpc.ComunicatorImplBase {

    @Override
    public void findAllAnimals(ComunicatorOuterClass.empty empty, StreamObserver<ComunicatorOuterClass.protoAnimal> responseStream){
        System.out.println("Riecieved request to get all Animals");
        List<Animal> result = new ArrayList<>();

        try {


            result.add(TestRepo.getInstance().getByRegNumber(12));
            result.addAll(AnimalDao.getInstance().getAll());
            System.out.println("in impl with list of size::"+result.size());


            responseStream.onCompleted();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
    @Override
    public void saveAnimal(ComunicatorOuterClass.protoAnimal animal , StreamObserver<ComunicatorOuterClass.stringResponse> streamObserver){

        System.out.println("Recievied request to save animal with reg n:: "+animal.getRegNumber());
        Date date = null;
        Animal animal1 = null;
        try {
            date = new Date(animal.getDate().getYear(),animal.getDate().getMonth(),animal.getDate().getDay());
            animal1 = new Animal(date,animal.getWight(),animal.getRegNumber(),animal.getOrigin());

            AnimalDao.getInstance().save(animal1);

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        streamObserver.onNext(ComunicatorOuterClass.stringResponse.newBuilder().setResponse("animal saved").build());

        streamObserver.onCompleted();


    }

    @Override
    public  void findByRegNumber(ComunicatorOuterClass.longRequest request,StreamObserver<ComunicatorOuterClass.protoAnimal> streamObserver){
        System.out.println("Recievied request to get animal with reg n:: "+request.getRequest());



        try {
            Animal  animal1 = AnimalDao.getInstance().getByRegNumber( request.getRequest());
            System.out.println("in comunicator inmpl"+ animal1.getOrigin());
            Date date = animal1.getArrivalDate();



            ComunicatorOuterClass.protoDate protoDate = ComunicatorOuterClass.protoDate.newBuilder()
                    .setYear(date.getYear())
                    .setMonth(date.getMonth())
                    .setDay(date.getDay()).build();



                ComunicatorOuterClass.protoAnimal prAnimal = ComunicatorOuterClass.protoAnimal.newBuilder().
                        setDate(protoDate)
                        .setRegNumber(animal1.getRegNumber())
                        .setWight(animal1.getWeight())
                        .setOrigin(animal1.getOrigin())
                        .build();
                streamObserver.onNext(prAnimal);






        } catch (Exception e) {
            System.out.println(e.getMessage());;
        }

        streamObserver.onCompleted();


    }
}
