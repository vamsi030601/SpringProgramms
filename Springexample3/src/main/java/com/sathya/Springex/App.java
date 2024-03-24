package com.sathya.Springex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        //start the container
    	ApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class); 
    			 Greetingimpl  greetingimpl = context.getBean("greet", Greetingimpl.class); 
    			 greetingimpl.greet();
    }
}
