package com.example.assignmentproj.repository;

import com.example.assignmentproj.grpcImplementation.ObjectTranslator;
import com.example.assignmentproj.model.Animal;
import com.example.assignmentproj.model.Date;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import org.springframework.stereotype.Repository;
import protobuff.ComunicatorGrpc;
import protobuff.ComunicatorOuterClass;

import java.util.*;


@Repository
public class AnimalRepository0 implements IAnimalRepository {
    private static final Map<Long, Animal> animalMap = new HashMap<>();


    //client
    ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost",9999).usePlaintext().build();
    ComunicatorGrpc.ComunicatorBlockingStub stub = ComunicatorGrpc.newBlockingStub(channel);


    static {
        initDatasource();
    }

    private static void initDatasource(){
        Animal a0 = new Animal(new Date(),32.5,1234,"bistria","pork");
        Animal a1 = new Animal(new Date(2022,9,17),92.5,72,"borinio","lamb");
        Animal a2 = new Animal(new Date(2013,8,22),54.6,34,"piazza");
        Animal a3 = new Animal(new Date(),14.4,3,"piazza");


        animalMap.put(a0.getRegNumber(),a0);
        animalMap.put(a1.getRegNumber(),a1);
        animalMap.put(a2.getRegNumber(),a2);
        animalMap.put(a3.getRegNumber(),a3);
    }

    public  Animal save(Animal a){
       // animalMap.put(a.getRegNumber(),a);
        stub.saveAnimal(ObjectTranslator.getInstance().getProtoAnimal(a));

        return a;
    }
    public Animal findByRegNumber(long regNumber){
        Animal result;
        ComunicatorOuterClass.longRequest request = ComunicatorOuterClass.longRequest.newBuilder().setRequest(regNumber).build();
        result =  ObjectTranslator.getInstance().getAnimalFromProto(stub.findByRegNumber(request));
        return result;



       // return animalMap.get(regNumber);
    }

    public Animal update(Animal a){
        animalMap.put(a.getRegNumber(),a);
        return a;
    }

    public void deleteByRegNumber(long regNumber){
        animalMap.remove(regNumber);
    }

    public List<Animal> findAll(){

        List<Animal> result = new ArrayList<>();
    //   result.add(ObjectTranslator.getInstance().getAnimalFromProto(stub.findAllAnimals(ComunicatorOuterClass.empty.newBuilder().build())));
        //  return result;
        ComunicatorOuterClass.empty req = ComunicatorOuterClass.empty.newBuilder().build();
        Iterator<ComunicatorOuterClass.protoAnimal> protoAnimalIterator;

        protoAnimalIterator = stub.findAllAnimals(req);

        try {

        for (int i = 1; protoAnimalIterator.hasNext();i++){
            result.add(ObjectTranslator.getInstance().getAnimalFromProto(protoAnimalIterator.next()));

        }}catch (StatusRuntimeException e){
            System.out.println(e.getStatus());
        }
      /**  Stock request = Stock.newBuilder()
                .setTickerSymbol("AU")
                .setCompanyName("Austich")
                .setDescription("server streaming example")
                .build();
        Iterator<StockQuote> stockQuotes;
        try {
            logInfo("REQUEST - ticker symbol {0}", request.getTickerSymbol());
            stockQuotes = blockingStub.serverSideStreamingGetListStockQuotes(request);
            for (int i = 1; stockQuotes.hasNext(); i++) {
                StockQuote stockQuote = stockQuotes.next();
                logInfo("RESPONSE - Price #" + i + ": {0}", stockQuote.getPrice());
            }
        } catch (StatusRuntimeException e) {
            logInfo("RPC failed: {0}", e.getStatus());
        }
       */
      return result;
    }

    public List<Animal>findByDate(Date date) {
        Collection<Animal> c = animalMap.values();
        List <Animal> result = new ArrayList<>();

        for(Animal animal:c){
            if(animal.getArrivalDate().compareTo(date)){
                result.add(animal);
            }
        }
        return result;

    }

    public List<Animal> findByOrigin(String origin){
        Collection<Animal> c = animalMap.values();
        List<Animal> result = new ArrayList<>();
        result.addAll(c);
        for (int i = 0; i<result.size();i++){
            if (!result.get(i).getOrigin().equalsIgnoreCase(origin)){
                result.remove(i);
            }

        }
        System.out.println(result.size());
        return result;


    }
}
