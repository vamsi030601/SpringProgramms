package com.sathya.Springex.JavaBasedConfiguration1;

import org.springframework.stereotype.Component;

@Component
public class EmailService implements MessageService{

	@Override
	public void message() {
		System.out.println("your will get email id updates");
		System.out.println("please check the email");
		
		
	}

}
