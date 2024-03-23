package com.FoodDelivery.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.FoodDelivery.model.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
