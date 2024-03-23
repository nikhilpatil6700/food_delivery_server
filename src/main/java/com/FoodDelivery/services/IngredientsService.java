package com.FoodDelivery.services;

import java.util.List;

import com.FoodDelivery.Exception.FoodException;
import com.FoodDelivery.Exception.RestaurantException;
import com.FoodDelivery.model.Food;
import com.FoodDelivery.model.IngredientCategory;
import com.FoodDelivery.model.IngredientsItem;
import com.FoodDelivery.repository.IngredientsCategoryRepository;

public interface IngredientsService {
	
	public IngredientCategory createIngredientsCategory(
			String name,Long restaurantId) throws RestaurantException;

	public IngredientCategory findIngredientsCategoryById(Long id) throws Exception;

	public List<IngredientCategory> findIngredientsCategoryByRestaurantId(Long id) throws Exception;
	
	public List<IngredientsItem> findRestaurantsIngredients(
			Long restaurantId);

	
	public IngredientsItem createIngredientsItem(Long restaurantId, 
			String ingredientName,Long ingredientCategoryId) throws Exception;

	public IngredientsItem updateStoke(Long id) throws Exception;
	
}
