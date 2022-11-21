package com.example.assignmentproj.grpcImplementation;

import io.grpc.stub.StreamObserver;
import protobuff.ComunicatorGrpc;
import protobuff.ComunicatorOuterClass.protoAnimal;
import protobuff.ComunicatorOuterClass.stringResponse;

public class ComunicatorImp extends ComunicatorGrpc.ComunicatorImplBase {


    private static ComunicatorImp instance  = null;
    private ComunicatorImp(){

    }
    public static synchronized ComunicatorImp getInstance() {
        if (instance==null){
            instance= new ComunicatorImp();
        }
        return instance;
    }

    @Override
    public void saveAnimal(protoAnimal animal , StreamObserver<stringResponse> streamObserver){

        System.out.println("Spring api req save animal with reg number"+animal.getRegNumber());


    }

}
