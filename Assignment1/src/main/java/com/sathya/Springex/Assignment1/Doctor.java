package com.sathya.Springex.Assignment1;

public class Doctor {
	private int id;
	private String name;
	public Doctor(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public void doctorInfo() {
		System.out. println("id of the doctor  "+id);
		System.out. println("name of the doctor "+name);
	}

}