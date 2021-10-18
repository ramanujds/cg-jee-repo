package com.cg.app.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDetails {

	private MenuItem item;
	
	private Coupon coupon;
	
	
	private float totalAmount;
	
	
	
	
}
