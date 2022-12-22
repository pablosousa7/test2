package com.udacity.store.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "products")
@Getter
@Setter
public class Product implements Serializable{
    @Id
    private Long id;
    
    private String name;
    private String description;
    private String image;
    private BigDecimal price;
}
