package com.sathya.Springex.JavaBasedConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class JavaConfig {
	@Bean
	
	public person person1()
	{
	person person1=new person();
	person1.setName("vamsi");
	person1.setEmailId("Vamsisanamandra0@gmail.com");
	return person1;
	}
	@Bean
	public person person2()
	{
		person person2=new person();
		person2.setName("kesava");
		person2.setEmailId("kesava132@gmail.com");
		return person2;	
	}
	

}
