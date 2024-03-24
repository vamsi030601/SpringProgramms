package com.sathya.Springex.JavaBasedConfiguration1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	//start the container
       ApplicationContext context=new AnnotationConfigApplicationContext(Javaconfig.class);
       
       //get the bean
       Student student=context.getBean("student",Student.class);
       student.details();
    }
}
