package com.FoodDelivery.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.FoodDelivery.model.PasswordResetToken;

public interface PasswordResetTokenRepository extends JpaRepository<PasswordResetToken, Integer> {
	PasswordResetToken findByToken(String token);
}
