package com.FoodDelivery.services;

import java.util.List;

import com.FoodDelivery.Exception.RestaurantException;
import com.FoodDelivery.model.Category;

public interface CategoryService {
	
	public Category createCategory (String name,Long userId) throws RestaurantException;
	public List<Category> findCategoryByRestaurantId(Long restaurantId) throws RestaurantException;
	public Category findCategoryById(Long id) throws RestaurantException;

}
