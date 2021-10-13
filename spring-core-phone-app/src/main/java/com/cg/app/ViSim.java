package com.cg.app;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("vi")
@Scope("prototype")
public class ViSim implements Sim {

	@Value("${vi.callCharges}")
	float callCharges;
	
	@Value("${vi.smsCharges}")
	float smsCharges;
	
	
	@Value("#{${vi.networks}}")
	Map<String,Integer> supportedNetworks;
	
	public ViSim() {
		System.out.println("Vi Sim Created..");
	}
	
	public void showSupportedNetworks() {
		supportedNetworks.forEach((network,year)->System.out.println("Network - "+network+" launched in "+year));
	}
	
	
	
	public Map<String, Integer> getSupportedNetworks() {
		return supportedNetworks;
	}



	public void setSupportedNetworks(Map<String, Integer> supportedNetworks) {
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
		System.out.println("Making a Call using Vi... Charges - "+callCharges);
		
	}
	
	@Override
	public void sendText() {
		System.out.println("Sending a Text using Vi...Charges - "+smsCharges);
		
	}

	
}
