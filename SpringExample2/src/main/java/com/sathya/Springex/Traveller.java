package com.sathya.Springex;

public class Traveller {
	private String name;
	private String email;
	private Long mobile;
	Vehicle vehicle;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getMobile() {
		return mobile;
	}
	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	public void startJourney()
	{
		System.out.println("Hey "+name+"  welcome to travel world");
		System.out.println("check your mobile..."+mobile+" emailid..."+email);
		vehicle.move();
	}

}
