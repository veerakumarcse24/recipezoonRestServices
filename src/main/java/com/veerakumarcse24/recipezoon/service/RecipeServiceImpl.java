package com.veerakumarcse24.recipezoon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

import com.veerakumarcse24.recipezoon.Repository.RecipeRepository;
import com.veerakumarcse24.recipezoon.modal.RecipeEntity;
import com.veerakumarcse24.recipezoon.modal.RecipesImagesEntity;
import com.veerakumarcse24.recipezoon.dto.RecipeRequestBean;

@Service("recipeService")
public class RecipeServiceImpl implements RecipeService {

    @Autowired // This means to get the bean called userRepository
    // Which is auto-generated by Spring, we will use it to handle the data
    private RecipeRepository recipeRepository;

    public void saveRecipe(RecipeRequestBean recipe) { //create Recipe
        RecipeEntity n = new RecipeEntity();
        n.setRecipeName(recipe.getRecipe_name());
        n.setRecipeDescription(recipe.getRecipe_description());
        n.setRecipeDue(recipe.getRecipe_due());
            Set <RecipesImagesEntity> recipe_img = new HashSet<RecipesImagesEntity>();
            recipe_img.add(new RecipesImagesEntity(recipe.getImage_url(), n));
            n.setRecipesImagesEntity(recipe_img);
        recipeRepository.save(n);
    }
    
}