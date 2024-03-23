package com.FoodDelivery.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.FoodDelivery.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
