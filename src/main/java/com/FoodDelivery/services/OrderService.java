package com.FoodDelivery.services;

import java.util.List;

import com.FoodDelivery.Exception.CartException;
import com.FoodDelivery.Exception.OrderException;
import com.FoodDelivery.Exception.RestaurantException;
import com.FoodDelivery.Exception.UserException;
import com.FoodDelivery.model.Order;
import com.FoodDelivery.model.PaymentResponse;
import com.FoodDelivery.model.User;
import com.FoodDelivery.request.CreateOrderRequest;
import com.stripe.exception.StripeException;

public interface OrderService {
	
	 public PaymentResponse createOrder(CreateOrderRequest order, User user) throws UserException, RestaurantException, CartException, StripeException;
	 
	 public Order updateOrder(Long orderId, String orderStatus) throws OrderException;
	 
	 public void cancelOrder(Long orderId) throws OrderException;
	 
	 public List<Order> getUserOrders(Long userId) throws OrderException;
	 
	 public List<Order> getOrdersOfRestaurant(Long restaurantId,String orderStatus) throws OrderException, RestaurantException;
	 

}
