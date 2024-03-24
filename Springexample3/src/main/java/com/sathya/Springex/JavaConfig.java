package com.sathya.Springex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class JavaConfig {
	@Bean
	public  Greetingimpl greet()
	{
		 Greetingimpl  greetingimpl= new  Greetingimpl ();
		 return  greetingimpl; 
	}
	
	
}
