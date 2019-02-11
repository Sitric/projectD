package com.sitric.repositories;

import com.sitric.model.RecipeStep;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipeStepRepository extends MongoRepository<RecipeStep, Long> {
}
