package com.github.wemilli.study_apir.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.wemilli.study_apir.dto.ProductRequestCreate;
import com.github.wemilli.study_apir.dto.ProductRequestUpdate;
import com.github.wemilli.study_apir.model.Product;
import com.github.wemilli.study_apir.service.ProductService;

@RestController
@RequestMapping("produtos")
public class ControllerProduct {

    @Autowired
    private ProductService productService;

    @PostMapping
    public ResponseEntity<Product> create(@RequestBody ProductRequestCreate dto) {
        Product productCreated = productService.createProduct(dto);
        return ResponseEntity.status(201).body(productCreated);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> findById(
         @PathVariable Long id) {
        return productService.getProductById(id)
            .map(ResponseEntity::ok)
            .orElse(ResponseEntity.noContent().build()); 
    }

    @GetMapping
    public ResponseEntity<List <Product>> findAll() {
        productService.getProductById(null);
        return ResponseEntity.ok(productService.getAll());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Product> update(
                @PathVariable Long id, 
                @RequestBody ProductRequestUpdate dto) {

        return productService.updateProduct(id, dto)
                    .map(ResponseEntity::ok)
                    .orElse(ResponseEntity.notFound().build());

        // Optional<Product> productUpdate =
        //     productService.updateProduct(id, product);
        //  if(productUpdate.isPresent()){
        //     return ResponseEntity.ok(productUpdate.get());
        //  }
        // return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete( @PathVariable Long id) {
        boolean result = productService.deleteProduct(id);
        if (result) {
            return ResponseEntity.noContent().build();
        }else{
            return ResponseEntity.noContent().build();
        }
    }

}
