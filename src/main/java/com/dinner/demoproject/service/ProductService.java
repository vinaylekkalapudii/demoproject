package com.dinner.demoproject.service;

import com.dinner.demoproject.model.Productsnew;
import com.dinner.demoproject.repo.ProductsRepo;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductService {
    private final ProductsRepo repo;
    public ProductService(ProductsRepo repo){

        this.repo=repo;
    }

    public List<Productsnew> getProducts(){
        return repo.findAll();
    }

    public Productsnew getProductsById(int prodId) {
        return  repo.findById(prodId).orElse(null);
    }

    public Productsnew postMyData(Productsnew prod) {
         return repo.save(prod);
    }

    public void deleteById(int prodId) {
        repo.deleteById(prodId);
    }

    public void putMyData(Productsnew prod) {
        repo.save(prod);
    }
}