package com.sakib.simpleWebApp.controller;

import com.sakib.simpleWebApp.model.Product;
import com.sakib.simpleWebApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class ProductController {

    @Autowired
    ProductService service;
    @GetMapping("/product")
    public List<Product> getProducts(){
        return service.getProduct();
    }

    @RequestMapping("/product/{prodId}")
    public Product getProductById(@PathVariable int prodId)
    {
        return service.getProductById(prodId);
    }

    @PostMapping("/product")
    public void addProduct(@RequestBody Product prod){
        service.addProduct(prod);
    }

    @PutMapping("/product")
    public void updateProduct(@RequestBody Product prod)
    {
        System.out.println(prod);
        service.updateProduct(prod);
    }

    @PutMapping("/product/{prodId}")
    public void deleteProduct(@PathVariable int prodId){
    service.deleteProduct(prodId);
    }
}
