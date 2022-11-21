package org.example;


import ComunicatorImp.ComunicatorImp;
import Persistance.AnimalDao;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import model.Animal;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException, SQLException {

        System.out.println("Hello world! on port 9999");
        Server server =  ServerBuilder.forPort(9999).addService(new ComunicatorImp()).build().start();
        List<Animal> buffer = new ArrayList<>();
        buffer.addAll(AnimalDao.getInstance().getAll());
        server.awaitTermination();
    }
}