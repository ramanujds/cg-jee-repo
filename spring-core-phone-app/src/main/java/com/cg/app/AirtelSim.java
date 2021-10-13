package com.cg.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("airtel")
@Scope("prototype")
public class AirtelSim implements Sim {

	@Value("${airtel.callCharges}")
	float callCharges;
	
	@Value("${airtel.smsCharges}")
	float smsCharges;
	
	@Value("#{${airtel.networks}}")
	List<String> supportedNetworks;
	
	
	public AirtelSim() {
		System.out.println("Aiterl Sim Created");
	}
	
	public void showSupportedNetworks() {
		supportedNetworks.forEach(System.out::println);
	}
	
	
	public List<String> getSupportedNetworks() {
		return supportedNetworks;
	}

	public void setSupportedNetworks(List<String> supportedNetworks) {
		this.supportedNetworks = supportedNetworks;
	}

	public float getCallCharges() {
		return callCharges;
	}

	public void setCallCharges(float callCharges) {
		this.callCharges = callCharges;
	}

	public float getSmsCharges() {
		return smsCharges;
	}

	public void setSmsCharges(float smsCharges) {
		this.smsCharges = smsCharges;
	}

	@Override
	public void makeACall() {
		System.out.println("Making a Call using Airtel... Charges - "+callCharges);
		
	}
	
	@Override
	public void sendText() {
		System.out.println("Sending a Text using Airtel...Charges - "+smsCharges);
		
	}
	
}
