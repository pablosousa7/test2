package com.udacity.store.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import com.udacity.store.model.Order;
import com.udacity.store.model.Product;
import com.udacity.store.repository.OrderRepository;

@RestController
@RequestMapping("api/")
@CrossOrigin(origins = "*")
public class OrderController {

    @Autowired
    OrderRepository orderRepository;

    @GetMapping("/orders")
    public ResponseEntity<?> products(){
        return ResponseEntity.ok().body(orderRepository.findAll());
    }

    @GetMapping("/order/{id}")
    public ResponseEntity<?> productId(@PathVariable Long id){
       return ResponseEntity.ok().body(orderRepository.findById(id));
    }

    @PostMapping(value="/order")
    public ResponseEntity<Order> saveOrder(@RequestBody Order order){
        orderRepository.save(order);
        return ResponseEntity.ok().body(order);
    }
}
