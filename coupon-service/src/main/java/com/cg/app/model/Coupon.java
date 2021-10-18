package com.cg.app.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Coupon {

	@Id
	private int id;
	private String couponCode;
	private float discount;
	private LocalDate validTill;
	
	
	
}
