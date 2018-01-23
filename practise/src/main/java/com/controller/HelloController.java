package com.controller;

import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.configuration.OrderMap;
import com.dto.OrderDto;
import com.model.Address;
import com.model.Customer;
import com.model.Name;
import com.model.Order;

@RestController
public class HelloController {
	/*static Order order = new Order();
	static Customer customer = new Customer();
	static Name name = new Name();
	static Address address = new Address();*/
	static OrderDto orderDto = new OrderDto();
	static {
		/*name.setFirstName("jas");
		name.setLastName("singh");
		address.setCity("city");
		address.setStreet("street");
		customer.setName(name);
		order .setBillingAddress(address);
		order.setCustomer(customer);*/
		
		
		orderDto.setCustomerFirstName("dtofirstname");
		orderDto.setCustomerLastName("dtolastname");
		orderDto.setBillingCity("dtocity");
		orderDto.setBillingStreet("dtostrret");
	}

	@RequestMapping("/")
	public Order home() {
		ModelMapper modelMapper = new ModelMapper();
		OrderMap orderMap = new OrderMap();
		modelMapper.addMappings(orderMap);
		//OrderDto orderDTO = modelMapper.map(order, OrderDto.class);
		Order order = modelMapper.map(orderDto, Order.class);
		System.out.println(order);
		return order;
	}

	@PostMapping("/")
	String home2() {
		return "bye world";
	}
}
