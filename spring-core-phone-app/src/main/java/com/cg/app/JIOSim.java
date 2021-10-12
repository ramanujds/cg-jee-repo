package com.cg.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("jio")
public class JIOSim implements Sim {

	@Value("${jio.callCharges}")
	float callCharges;
	
	@Value("${jio.smsCharges}")
	float smsCharges;
	
	@Override
	public void showSupportedNetworks() {
		// TODO Auto-generated method stub
		
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
		System.out.println("Making a Call using JIO... Charges - "+callCharges);
		
	}
	
	@Override
	public void sendText() {
		System.out.println("Sending a Text using JIO...Charges - "+smsCharges);
		
	}

	
}
