package com.configuration;

import org.modelmapper.PropertyMap;

import com.dto.OrderDto;
import com.model.Order;

public class OrderMap extends PropertyMap<OrderDto,Order> {

	@Override
	protected void configure() {
		 //map().getBillingA(source.getBillingAddress().getStreet());
		 map(source.billingCity, destination.billingAddress.getCity());
		 map(source.billingStreet, destination.billingAddress.getStreet());
		
	}

}
