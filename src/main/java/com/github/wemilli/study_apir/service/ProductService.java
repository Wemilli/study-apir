package com.github.wemilli.study_apir.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.github.wemilli.study_apir.model.Product;

@Service 
public class ProductService {

    private List<Product> products = new ArrayList<>();

    private long sequence =1L;

    public Product createProduct(Product product) {
        product.setId(sequence++);
        products.add(product);
        return product;
    }

    public Product getProductById(Long id) {
        return null;
    }

    public Product updateProduct(Long id, Product product) {

        return product;
    }

    public void deleteProduct(Long id) {

    }
}
