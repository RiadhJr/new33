package com.example.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.entity.AdjustmentDetails;
import com.example.entity.Adjustments;

public interface AdjustmentsRepository extends CrudRepository<Adjustments, Long> {

}
