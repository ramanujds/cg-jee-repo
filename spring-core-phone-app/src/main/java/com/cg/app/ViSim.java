package com.cg.app;

public class ViSim implements Sim {

float callCharges;
	
	float smsCharges;
	
	
	
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
		System.out.println("Making a Call using Vi... Charges - "+callCharges);
		
	}
	
	@Override
	public void sendText() {
		System.out.println("Sending a Text using Vi...Charges - "+smsCharges);
		
	}

	
}
