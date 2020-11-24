package com.farmfarmfarm.farmfarmfarm.repository;


import com.farmfarmfarm.farmfarmfarm.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface userRepo extends CrudRepository<User , Long> {

}
