package com.dinner.demoproject.repo;

import com.dinner.demoproject.model.Productsnew;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductsRepo extends JpaRepository<Productsnew, Integer> {

}
