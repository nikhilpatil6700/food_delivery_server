package com.FoodDelivery.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.FoodDelivery.model.Review;

public interface ReviewRepository extends JpaRepository<Review, Long> {

}
