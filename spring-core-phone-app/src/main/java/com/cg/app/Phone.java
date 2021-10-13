package com.cg.app;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import javax.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("phone")
@Scope("singleton")
@Lazy
public class Phone implements InitializingBean, DisposableBean {

	@Value("${phone.ram}")
	int ram;
	@Value("${phone.brand}")
	String brand;
	
	@Autowired
	@Qualifier("vi")
	Sim sim;
	
	@PostConstruct
	public void init() {
		System.out.println("Phone Started..");
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Phone Initialized");
		
	}
	
	
	public int getRam() {
		return ram;
	}




	public void setRam(int ram) {
		this.ram = ram;
	}




	public String getBrand() {
		return brand;
	}




	public void setBrand(String brand) {
		this.brand = brand;
	}




	public Sim getSim() {
		return sim;
	}




	public void setSim(Sim sim) {
		this.sim = sim;
	}




	public Phone() {
		System.out.println("Phone Created..");
	}
	
	
	
	
	public Phone(int ram, String brand) {
		super();
		this.ram = ram;
		this.brand = brand;
	}




	public void makeACall() {
		sim.makeACall();
	}
	
	public void sendText() {
		sim.sendText();
	}
	
	public void showSimSupportedNetworks() {
		sim.showSupportedNetworks();
	}
	
	public void printPhoneDetails() {
		System.out.println("Brand - "+brand);
		System.out.println("RAM - "+ram);
	}
	
	@PreDestroy
	public void destroyMethod() {
		
	}
	
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		
	}
	
}
