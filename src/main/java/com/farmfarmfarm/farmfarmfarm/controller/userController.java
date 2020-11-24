package com.farmfarmfarm.farmfarmfarm.controller;


import com.farmfarmfarm.farmfarmfarm.dto.dataUserDto;
import com.farmfarmfarm.farmfarmfarm.entity.Product;
import com.farmfarmfarm.farmfarmfarm.entity.User;
import com.farmfarmfarm.farmfarmfarm.repository.productRepo;
import com.farmfarmfarm.farmfarmfarm.repository.userRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class userController {
    @Autowired
    userRepo userRepo;
    @Autowired
    productRepo productRepo;
    @GetMapping("/User")
    public List<User> funcGetUser (){
            return (List<User>)userRepo.findAll();
    }

    @PostMapping("/User")
    public List<User> insertdata(@RequestBody dataUserDto res ){
                   productRepo.save(res.getUser().getProducts().get(0));
                   userRepo.save(res.getUser());
                   return null;
    }

    @PostMapping("/Product")
    public List<Product> insert(@RequestBody User res){
        productRepo.saveAll(res.getProducts());
         User user = userRepo.save(res);
       return null;
    }

}
