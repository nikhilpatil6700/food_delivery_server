package com.FoodDelivery.services;

import java.util.List;

import com.FoodDelivery.Exception.ReviewException;
import com.FoodDelivery.model.Review;
import com.FoodDelivery.model.User;
import com.FoodDelivery.request.ReviewRequest;

public interface ReviewSerive {
	
    public Review submitReview(ReviewRequest review,User user);
    public void deleteReview(Long reviewId) throws ReviewException;
    public double calculateAverageRating(List<Review> reviews);
}
