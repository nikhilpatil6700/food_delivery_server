package com.FoodDelivery.services;

import com.FoodDelivery.Exception.CartException;
import com.FoodDelivery.Exception.CartItemException;
import com.FoodDelivery.Exception.FoodException;
import com.FoodDelivery.Exception.UserException;
import com.FoodDelivery.model.Cart;
import com.FoodDelivery.model.CartItem;
import com.FoodDelivery.model.Food;
import com.FoodDelivery.model.User;
import com.FoodDelivery.request.AddCartItemRequest;
import com.FoodDelivery.request.UpdateCartItemRequest;

public interface CartSerive {

	public CartItem addItemToCart(AddCartItemRequest req, String jwt) throws UserException, FoodException, CartException, CartItemException;

	public CartItem updateCartItemQuantity(Long cartItemId,int quantity) throws CartItemException;

	public Cart removeItemFromCart(Long cartItemId, String jwt) throws UserException, CartException, CartItemException;

	public Long calculateCartTotals(Cart cart) throws UserException;
	
	public Cart findCartById(Long id) throws CartException;
	
	public Cart findCartByUserId(Long userId) throws CartException, UserException;
	
	public Cart clearCart(Long userId) throws CartException, UserException;
	

	

}
