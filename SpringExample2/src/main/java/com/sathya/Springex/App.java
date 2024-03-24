package com.sathya.Springex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        //start the container
    	
    	ApplicationContext context=new ClassPathXmlApplicationContext("Spring-config.xml");
    	
    	//Get the Bean
    	
    	Traveller traveller=context.getBean("traveller",Traveller.class);
    	traveller.startJourney();
    }
}
