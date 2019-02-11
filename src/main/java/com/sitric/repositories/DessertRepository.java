package com.sitric.repositories;

import com.sitric.model.Dessert;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DessertRepository extends MongoRepository<Dessert, Long> {
}
