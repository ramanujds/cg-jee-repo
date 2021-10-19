package com.cg.app.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.cg.app.model.Coupon;
import com.cg.app.model.MenuItem;
import com.cg.app.model.OrderDetails;

@Service
public class OrderService {

	
	@Autowired
	RestTemplate rt;
	
	public OrderDetails getOderDetails(int menuItemId, String couponCode) {
		
		MenuItem item= rt.getForObject("http://menu-item-service/items/"+menuItemId, MenuItem.class);
		Coupon coupon= rt.getForObject("http://coupon-service/coupons/coupon-code/"+couponCode, Coupon.class);
		
		float price=item.getPrice();
		if(coupon.getValidTill().isAfter(LocalDate.now())) {
		price=price-price*(coupon.getDiscount()/100);
		}
		
		return new OrderDetails(item,coupon,price);
		
				
		
	}
	
	
}
