package com.cg.app.service;

import java.time.LocalDate;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.app.model.Coupon;
import com.cg.app.repo.CouponRepo;

@Service
public class CouponService {
	
	@Autowired
	CouponRepo repo;
	
	@PostConstruct
	public void addSomeCoupons() {
		
		Coupon coupon1=new Coupon(2001,"c101",7.5f,LocalDate.of(2021, 10, 31));
		Coupon coupon2=new Coupon(2002,"c102",9.5f,LocalDate.of(2021, 10, 15));
		Coupon coupon3=new Coupon(2003,"c103",12.5f,LocalDate.of(2021, 10, 31));
		
		repo.save(coupon1);
		repo.save(coupon2);
		repo.save(coupon3);
		
	}

	public Coupon getCouponByCouponCode(String couponCode) {
		return repo.findByCouponCode(couponCode);
	}
	
	
}
