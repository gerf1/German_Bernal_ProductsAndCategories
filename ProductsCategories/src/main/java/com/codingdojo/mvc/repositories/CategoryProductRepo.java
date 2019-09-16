package com.codingdojo.mvc.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.mvc.models.*;

@Repository
public interface CategoryProductRepo extends CrudRepository <CategoryProduct, Long> {
}