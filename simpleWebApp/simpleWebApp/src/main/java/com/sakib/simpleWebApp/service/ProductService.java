package com.sakib.simpleWebApp.service;

import com.sakib.simpleWebApp.model.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {
    List<Product> products = Arrays.asList(new Product(101, "Iphone", 50000), new Product(101, "Samsung", 50000), new Product(101, "Meta", 50000));

    public List<Product> getProduct() {
        return products;
    }
}
