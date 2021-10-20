package com.cg.app.controller;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.app.model.Coupon;
import com.cg.app.model.MenuItem;
import com.cg.app.model.OrderDetails;
import com.cg.app.service.OrderService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@RequestMapping("/orders")
public class OderController {
	
	@Autowired
	private OrderService service;
	
	@GetMapping("/item/{id}/coupon/{couponCode}")
	@HystrixCommand(fallbackMethod = "getOrderDetailsFallback")
	public OrderDetails getOrderDetails(@PathVariable int id, @PathVariable String couponCode) {
		return service.getOderDetails(id, couponCode);
	}
	
	
	public OrderDetails getOrderDetailsFallback(@PathVariable int id, @PathVariable String couponCode) {
		
		OrderDetails orderDetails=new OrderDetails(new MenuItem(id, "Choco Cake", 129), new Coupon(id, couponCode, 10, LocalDate.now()), 129);
		
		return orderDetails;
	}
	
	

}
