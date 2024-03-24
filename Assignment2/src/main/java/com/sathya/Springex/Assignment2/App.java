package com.sathya.Springex.Assignment2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	//start the container
       ApplicationContext context=new AnnotationConfigApplicationContext(Javaconfig.class);
       
       //get the bean
       
       Person person = context.getBean("person",Person.class);
       person.details();
       
    }
}
