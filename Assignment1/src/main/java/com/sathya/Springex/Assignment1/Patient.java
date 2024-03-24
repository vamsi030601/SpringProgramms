package com.sathya.Springex.Assignment1;

public class Patient {
	private String name;
	private int age;
	private Doctor doctor;
	private pharmacy pharmacy;
	
	public Patient(String name, int age, Doctor doctor, com.sathya.Springex.Assignment1.pharmacy pharmacy) {
		super();
		this.name = name;
		this.age = age;
		this.doctor = doctor;
		this.pharmacy = pharmacy;
	}
	
	public void details()
	{
		System.out. println("name of the patient "+name);
		System.out. println("age of the patient "+age);
		doctor.doctorInfo();
		pharmacy.pharinfo();
		
	}
}
