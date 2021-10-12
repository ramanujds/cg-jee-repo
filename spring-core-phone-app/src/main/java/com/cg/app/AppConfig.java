package com.cg.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = {"com.cg.app"})
@PropertySource("app.properties")
public class AppConfig {

//	
//	@Bean("airtel")
//	public AirtelSim getAirtelSim() {
//		AirtelSim airtel=new AirtelSim();
//		airtel.setCallCharges(2.5F);
//		airtel.setSmsCharges(1.2F);
//		return airtel;	
//	}
//	
//	
//	@Bean("vi")
//	public ViSim getViSim() {
//		ViSim vi=new ViSim();
//		vi.setCallCharges(1.5F);
//		vi.setSmsCharges(1);
//		return vi;
//	}
//	
//	
//	@Bean("jio")
//	public JIOSim getJioSim() {
//		JIOSim jio=new JIOSim();
//		jio.setCallCharges(1.2F);
//		jio.setSmsCharges(.80F);
//		return jio;
//	}
//	
//	@Bean("phone")
//	public Phone getPhone() {
//		Phone phone=new Phone(6,"Apple");
//		phone.setSim(getAirtelSim());
//		return phone;
//	}
	
	
}
