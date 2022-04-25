package com.example.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.entity.AdjustmentDetails;
import com.example.entity.Adjustments;
import com.example.entity.Brands;
import com.example.entity.Categories;
import com.example.entity.Clients;

public interface ClientsRepository extends CrudRepository<Clients, Long> {

}
