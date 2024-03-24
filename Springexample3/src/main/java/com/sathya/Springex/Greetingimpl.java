package com.sathya.Springex;

public class Greetingimpl implements Greeting
{

	@Override
	public void greet() {
		System.out.println("Good morning");
		System.out.println("this is java based configuration");
	}
     public Greetingimpl() {
    	 System.out.println("Greetingimpl constructor::object created");
     }
}
