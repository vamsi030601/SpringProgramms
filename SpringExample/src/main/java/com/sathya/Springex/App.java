package com.sathya.Springex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static  void main( String[] args )
    {
        //start the container
    	
    	ApplicationContext context= new ClassPathXmlApplicationContext("Spring-config.xml");
    	System.out.println("*****");
    	
    	//Get the object from container call your methods
    	Greetingimp greetingimp=context.getBean("greet",Greetingimp.class);
    	greetingimp.greet();
    	
    }
}
 