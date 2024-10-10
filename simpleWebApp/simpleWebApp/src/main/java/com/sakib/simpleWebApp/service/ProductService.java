package com.sakib.simpleWebApp.service;

import com.sakib.simpleWebApp.model.Product;
import com.sakib.simpleWebApp.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductRepo repo;

//    List<Product> products = new ArrayList<>(Arrays.asList(new Product(101, "Iphone", 50000), new Product(101, "Samsung", 50000), new Product(101, "Meta", 50000)));

    public List<Product> getProduct() {
        return repo.findAll();
    }

    public Product getProductById(int prodId) {
//        return products.stream().filter(p -> p.getProdId() == prodId).findFirst().orElse(new Product(100, "No", 0));
  return repo.findById(prodId).orElse(new Product(420, "Null", 0));
    }

    public void addProduct(@RequestBody Product prod){
//        System.out.println(prod);
//        products.add(prod);
        repo.save(prod);
    }

    public void updateProduct(Product prod) {

//        int index = 0;
//        for(int i=0; i<products.size();i++)
//        {
//            if(products.get(i).getProdId() == prod.getProdId())
//            {
//                index=i;
//            }
//        }
//        products.set(index,prod);
        repo.save(prod);
    }

    public void deleteProduct(int prodId) { int index = 0;
//        for(int i=0; i<products.size();i++)
//        {
//            if(products.get(i).getProdId() == prodId)
//            {
//                index=i;
//            }
//        }
//
//        products.remove(index);
        repo.deleteById(prodId);
    }
}
