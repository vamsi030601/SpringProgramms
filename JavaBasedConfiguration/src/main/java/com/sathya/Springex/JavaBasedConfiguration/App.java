package com.sathya.Springex.JavaBasedConfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
    	person p1=context.getBean("person1",person.class);
    	p1.personInfo();
    	System.out.println("**********");
    	ApplicationContext context1=new AnnotationConfigApplicationContext(JavaConfig.class);
    	person p2=context1.getBean("person2",person.class);
    	p2.personInfo();
        
    }
}
