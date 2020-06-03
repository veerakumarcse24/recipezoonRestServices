package com.veerakumarcse24.recipezoon.Repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.veerakumarcse24.recipezoon.modal.RecipesImagesEntity;

@Repository
public interface RecipeImageRepository extends CrudRepository<RecipesImagesEntity, Integer>  {
    
}