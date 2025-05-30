package com.example.learningcrud.model;

import lombok.*;
import jakarta.persistence.*;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
   
    @Id
    @GeneratedValue
    private long id;
    private String name;
    private Double price;
    private String Description;
    
}
