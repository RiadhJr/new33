package com.example.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.entity.*;


public interface ProductsRepository extends CrudRepository<Products, Long> {

}
