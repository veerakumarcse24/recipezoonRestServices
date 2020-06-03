package com.veerakumarcse24.recipezoon.modal;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
 
@Entity(name = "ForeignKeyAssoAccountEntity")
@Table(name = "recipes_images", uniqueConstraints = {
@UniqueConstraint(columnNames = "id")})
public class RecipesImagesEntity implements Serializable {
    private static final long serialVersionUID = -6790693372846798580L;
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Integer imageId;
 
    @Column(name = "image_url", unique = false, nullable = false, length = 500)
    private String image_url;
 

    @ManyToOne
    @JoinColumn(name ="recipe_id")
    private RecipeEntity recipes;
    
    public void setimageId(Integer imageId) {
        this.imageId = imageId;
    }
    
    public Integer getimageId() {
        return imageId;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public String getImage_url() {
        return image_url;
    }

    public RecipeEntity getRecipeEntity() {
		return recipes;
	}

	public void setRecipeEntity(RecipeEntity recipes) {
		this.recipes = recipes;
    }
    
    public RecipesImagesEntity() {
         
    }
     
    public RecipesImagesEntity(String image_url, RecipeEntity recipes) {
        this.image_url = image_url;
        this.recipes = recipes;
    }
}