package com.veerakumarcse24.recipezoon.controller;

import com.veerakumarcse24.recipezoon.dto.RecipeRequestBean;
import com.veerakumarcse24.recipezoon.service.RecipeService;
import com.veerakumarcse24.recipezoon.util.AppConstants;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;


@RestController // This means that this class is a RestController
@RequestMapping(path=AppConstants.ROOTPATH) // This means URL's start with /demo (after Application path)

public class RecipeController {

    public static final Logger logger = LoggerFactory.getLogger(RecipeController.class);

    @Autowired
	RecipeService recipeService; 
    

    // -------------------Create a Recipe-------------------------------------------
    @PostMapping(path="/addRecipe", produces = MediaType.APPLICATION_JSON_VALUE) // Map ONLY POST Requests
    public ResponseEntity<?>  addNewRecipe (@RequestBody RecipeRequestBean reciperRequestBean, UriComponentsBuilder ucBuilder) 
    {       
            logger.info("Creating Recipe : {}", reciperRequestBean);
            recipeService.saveRecipe(reciperRequestBean);
            return new ResponseEntity<String>(AppConstants.RECORD_CREATED, HttpStatus.CREATED);
        
    }

    
}