package com.veerakumarcse24.recipezoon.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.veerakumarcse24.recipezoon.modal.RecipeEntity;

@Repository
public interface RecipeRepository extends CrudRepository<RecipeEntity, Integer> {
    
}