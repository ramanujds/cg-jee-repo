package com.cg.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.app.model.OrderDetails;
import com.cg.app.service.OrderService;

@RestController
@RequestMapping("/orders")
public class OderController {
	
	@Autowired
	private OrderService service;
	
	@GetMapping("/item/{id}/coupon/{couponCode}")
	public OrderDetails getOrderDetails(@PathVariable int id, @PathVariable String couponCode) {
		return service.getOderDetails(id, couponCode);
	}
	
	

}
