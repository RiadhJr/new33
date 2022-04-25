package com.example.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.entity.AdjustmentDetails;
import com.example.entity.Adjustments;
import com.example.entity.Brands;
import com.example.entity.Categories;

public interface CategoriesRepository extends CrudRepository<Categories, Long> {

}
