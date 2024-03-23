package com.FoodDelivery.services;

import java.util.List;

import com.FoodDelivery.model.Notification;
import com.FoodDelivery.model.Order;
import com.FoodDelivery.model.Restaurant;
import com.FoodDelivery.model.User;

public interface NotificationService {
	
	public Notification sendOrderStatusNotification(Order order);
	public void sendRestaurantNotification(Restaurant restaurant, String message);
	public void sendPromotionalNotification(User user, String message);
	
	public List<Notification> findUsersNotification(Long userId);

}
