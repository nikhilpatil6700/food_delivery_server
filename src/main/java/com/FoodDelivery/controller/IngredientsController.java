package com.FoodDelivery.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.FoodDelivery.model.IngredientCategory;
import com.FoodDelivery.model.IngredientsItem;
import com.FoodDelivery.request.CreateIngredientCategoryRequest;
import com.FoodDelivery.request.CreateIngredientRequest;
import com.FoodDelivery.request.Ingredient;
import com.FoodDelivery.services.IngredientsService;

@RestController
@RequestMapping("/api/admin/ingredients")
public class IngredientsController {
	
	@Autowired
	private IngredientsService ingredientService;

	@PostMapping("/category")
	public ResponseEntity<IngredientCategory> createIngredientCategory(
			@RequestBody CreateIngredientCategoryRequest req) throws Exception{
		IngredientCategory items=ingredientService.createIngredientsCategory(req.getName(), req.getRestaurantId());
		return new ResponseEntity<>(items,HttpStatus.OK);
	}

	@PostMapping()
	public ResponseEntity<IngredientsItem> createIngredient(
			@RequestBody CreateIngredientRequest req) throws Exception{

		IngredientsItem item=ingredientService.createIngredientsItem(req.getRestaurantId(),req.getName(),req.getIngredientCategoryId());
		return new ResponseEntity<>(item,HttpStatus.OK);
	}
	
	@PutMapping("/{id}/stoke")
	public ResponseEntity<IngredientsItem> updateStoke(@PathVariable Long id) throws Exception{
		IngredientsItem item=ingredientService.updateStoke(id);
		return new ResponseEntity<IngredientsItem>(item,HttpStatus.OK);
	}
	
	@GetMapping("/restaurant/{id}")
	public ResponseEntity<List<IngredientsItem>> restaurantsIngredient(
			@PathVariable Long id) throws Exception{
		List<IngredientsItem> items=ingredientService.findRestaurantsIngredients(id);
		return new ResponseEntity<>(items,HttpStatus.OK);
	}

	@GetMapping("/restaurant/{id}/category")
	public ResponseEntity<List<IngredientCategory>> restaurantsIngredientCategory(
			@PathVariable Long id) throws Exception{
		List<IngredientCategory> items=ingredientService.findIngredientsCategoryByRestaurantId(id);
		return new ResponseEntity<>(items,HttpStatus.OK);
	}

}
