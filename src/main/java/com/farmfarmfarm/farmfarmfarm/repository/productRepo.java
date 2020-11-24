package com.farmfarmfarm.farmfarmfarm.repository;


import com.farmfarmfarm.farmfarmfarm.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface productRepo extends CrudRepository<Product, Long> {
}
