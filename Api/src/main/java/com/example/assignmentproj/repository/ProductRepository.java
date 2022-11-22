package com.example.assignmentproj.repository;

import com.example.assignmentproj.model.Animal;
import com.example.assignmentproj.model.Product;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.stereotype.Repository;
import protobuff.ComunicatorGrpc;

import java.util.List;

@Repository
public class ProductRepository implements IProductRepostory{

    ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost",9999).usePlaintext().build();
    ComunicatorGrpc.ComunicatorBlockingStub stub = ComunicatorGrpc.newBlockingStub(channel);
    @Override
    public List<Animal> getAnimalsInProduct(int productId) {
        return null;
    }

    @Override
    public List<Long> getAnimalsRegNumberInProduct(int productId) {
        return null;
    }

    @Override
    public List<Product> getAllProductsFromAnimalRegNumber(long regNumber) {
        return null;
    }

    @Override
    public List<Product> findAllProducts() {
        return null;
    }
}
