package com.cg.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.app.model.Coupon;
import com.cg.app.service.CouponService;

@RestController
@RequestMapping("/coupons")
public class CouponController {

	@Autowired
	CouponService service;
	
	
	@GetMapping("/coupon-code/{couponCode}")
	public Coupon getCoupon(@PathVariable String couponCode) {
		
		return service.getCouponByCouponCode(couponCode);
		
	}
	
	
}
