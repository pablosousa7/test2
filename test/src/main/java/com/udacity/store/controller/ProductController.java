package com.udacity.store.controller;

import com.udacity.store.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/")
@CrossOrigin(origins = "*")
public class ProductController {

    @Autowired
    ProductRepository productRepository;

    @GetMapping("/products")
    public ResponseEntity<?> products(){
        return ResponseEntity.ok().body(productRepository.findAll());
    }

    @GetMapping("/product/{id}")
    public ResponseEntity<?> productId(@PathVariable Long id){
       return ResponseEntity.ok().body(productRepository.findById(id));
    }
}
