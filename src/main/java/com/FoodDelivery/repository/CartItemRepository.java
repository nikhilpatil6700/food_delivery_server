package com.FoodDelivery.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.FoodDelivery.model.CartItem;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {


//    CartItem findByFoodIsContaining

}
