package com.codingdojo.mvc.repositories;


import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.mvc.models.*;

@Repository
public interface CategoryRepo extends CrudRepository <Category, Long> {
	List<Category> findAll();
    List<Category> findByProductsNotContains(Product product);
}