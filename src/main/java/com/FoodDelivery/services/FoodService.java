package com.FoodDelivery.services;

import java.util.List;

import com.FoodDelivery.Exception.FoodException;
import com.FoodDelivery.Exception.RestaurantException;
import com.FoodDelivery.model.Category;
import com.FoodDelivery.model.Food;
import com.FoodDelivery.model.Restaurant;
import com.FoodDelivery.request.CreateFoodRequest;

public interface FoodService {

	public Food createFood(CreateFoodRequest req,Category category,
						   Restaurant restaurant) throws FoodException, RestaurantException;

	void deleteFood(Long foodId) throws FoodException;
	
	public List<Food> getRestaurantsFood(Long restaurantId,
			boolean isVegetarian, boolean isNonveg, boolean isSeasonal,String foodCategory) throws FoodException;
	
	public List<Food> searchFood(String keyword);
	
	public Food findFoodById(Long foodId) throws FoodException;

	public Food updateAvailibilityStatus(Long foodId) throws FoodException;
}
