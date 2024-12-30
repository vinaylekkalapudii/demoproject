package com.dinner.demoproject.controller;
import com.dinner.demoproject.model.Productsnew;
import com.dinner.demoproject.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    private final ProductService service;
    public  ProductController(ProductService service){
        this.service=service;
    }
@GetMapping("/products")
    public List<Productsnew>  getProducts(){
        return  service.getProducts();
    }
    @GetMapping("/products/{prodId}")
    public Productsnew getProductsById(@PathVariable int prodId){
        return service.getProductsById(prodId);
    }

    @PostMapping("/products")
    public Productsnew postMyData(@RequestBody Productsnew prod ){
       return service.postMyData(prod);
    }
    @PutMapping("/products")
    public void putMyData(@RequestBody Productsnew prod ){
        service.putMyData(prod);
    }
    @DeleteMapping("/products/{prodId}")
    public void deleteById(@PathVariable int prodId){
        service.deleteById(prodId);
    }
}