package com.farmfarmfarm.farmfarmfarm.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class User {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String surname;

    @OneToMany

    List<Product> products = new ArrayList<>();
}
