package com.veerakumarcse24.recipezoon.dto;

public class RecipeRequestBean {
    private String recipe_name;
    private Integer recipe_due;
    private String recipe_description;
    private String image_url;

    public String getRecipe_name(){
        return recipe_name;
    }

    public void setRecipe_name(String recipe_name){
        this.recipe_name = recipe_name;
    }

    public String getRecipe_description(){
        return recipe_description;
    }

    public void setRecipe_description(String recipe_description){
        this.recipe_description = recipe_description;
    }

    public String getImage_url(){
        return image_url;
    }

    public void setImage_url(String image_url){
        this.image_url = image_url;
    }

    public Integer getRecipe_due(){
        return recipe_due;
    }

    public void setRecipe_due(Integer recipe_due){
        this.recipe_due = recipe_due;
    }
}