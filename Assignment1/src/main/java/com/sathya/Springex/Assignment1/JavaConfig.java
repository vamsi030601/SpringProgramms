package com.sathya.Springex.Assignment1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	
	@Bean
	public Doctor doctor()
	{
		Doctor doctor=new Doctor(12,"sai");
		return doctor;
		
	}
	@Bean
     public pharmacy pharmacy()
     {
    	 pharmacy pharmacy=new pharmacy("siva","hyd");
    	 return pharmacy;
     }
	@Bean
     public Patient patient()
     {
    	Patient patient=new Patient("vamsi",23,doctor(),pharmacy());
    	return patient;
     }
}
