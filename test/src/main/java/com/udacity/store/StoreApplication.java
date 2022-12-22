package com.udacity.store;

import com.udacity.store.model.Product;
import com.udacity.store.repository.ProductRepository;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class StoreApplication  implements CommandLineRunner {

    public static void main(String[] args) {
            SpringApplication.run(StoreApplication.class, args);
        }

    @Autowired
    private ProductRepository productRepository;


    @Override
    public void run(String... args) throws Exception {
        Product product1 = new Product();
        product1.setId(1L);
        product1.setName("Book");
        product1.setDescription("Descrition teste for a book");
        product1.setPrice(new BigDecimal("9.99"));
        product1.setImage("https://assets.productschool.com/wp-content/uploads/2021/07/29105721/Book-Stack-EN.jpg");

        Product product2 = new Product();
        product2.setId(2L);
        product2.setName("Headphone");
        product2.setDescription("Descrition teste for a headphone");
        product2.setPrice(new BigDecimal("249.99"));
        product2.setImage("https://store.storeimages.cdn-apple.com/4982/as-images.apple.com/is/MX472?wid=1144&hei=1144&fmt=jpeg&qlt=95&.v=1570119347612");

        Product product3 = new Product();
        product3.setId(3L);
        product3.setName("Backpack");
        product3.setDescription("Descrition teste for a backpack");
        product3.setPrice(new BigDecimal("79.99"));
        product3.setImage("https://cdn.shopify.com/s/files/1/2986/1172/products/black-edb20_1024x1024.jpg?v=1595964079");
    
        productRepository.save(product1);
        productRepository.save(product2);
        productRepository.save(product3);
    }
}
