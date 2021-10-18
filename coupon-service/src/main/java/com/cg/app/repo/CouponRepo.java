package com.cg.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.app.model.Coupon;

public interface CouponRepo extends JpaRepository<Coupon, Integer> {

	public Coupon findByCouponCode(String couponCode);
	
}
