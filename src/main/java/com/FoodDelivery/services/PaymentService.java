package com.FoodDelivery.services;

import com.FoodDelivery.model.Order;
import com.FoodDelivery.model.PaymentResponse;
import com.stripe.exception.StripeException;

public interface PaymentService {
	
	public PaymentResponse generatePaymentLink(Order order) throws StripeException;

}
