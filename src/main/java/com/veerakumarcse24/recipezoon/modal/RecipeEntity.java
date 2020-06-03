package com.veerakumarcse24.recipezoon.modal;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
 
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
 
@Entity(name = "ForeignKeyAssoEntity")
@Table(name = "recipes", uniqueConstraints = {
@UniqueConstraint(columnNames = "id"),
@UniqueConstraint(columnNames = "recipe_name") })
public class RecipeEntity implements Serializable {
    private static final long serialVersionUID = -1798070786993154676L;
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Integer id;
 
    @Column(name = "recipe_name", unique = true, nullable = false, length = 100)
    private String recipe_name;
 
    @Column(name = "recipe_description", unique = false, nullable = true, length = 250)
    private String recipe_description;
 
    @Column(name = "recipe_due", unique = false, nullable = false)
    private Integer recipe_due;
 
    @OneToMany(mappedBy="recipes", cascade=CascadeType.ALL)
    private Set<RecipesImagesEntity> recipes_images;

    public Integer getId() {
        return id;
      }
    
      public void setId(Integer id) {
        this.id = id;
      }
    
      public String getRecipeName() {
        return recipe_name;
      }
    
      public void setRecipeName(String recipe_name) {
        this.recipe_name = recipe_name;
      }
    
      public String getRecipeDescription() {
        return recipe_description;
      }
    
      public void setRecipeDescription(String recipe_description) {
        this.recipe_description = recipe_description;
      }

      public Integer getRecipeDue() {
        return recipe_due;
      }
    
      public void setRecipeDue(Integer recipe_due) {
        this.recipe_due = recipe_due;
      }

      public Set<RecipesImagesEntity> getRecipesImagesEntity() {
        return recipes_images;
      }
    
      public void setRecipesImagesEntity(Set<RecipesImagesEntity> recipes_images) {
        this.recipes_images = recipes_images;
      }

      public RecipeEntity() { 
      }
       
      public RecipeEntity(String recipe_description) {
        this.recipe_description = recipe_description;
      }
}