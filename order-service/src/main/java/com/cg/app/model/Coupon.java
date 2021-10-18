package com.cg.app.model;

import java.time.LocalDate;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Coupon {

	private int id;
	private String couponCode;
	private float discount;
	private LocalDate validTill;
	
	
	
}
