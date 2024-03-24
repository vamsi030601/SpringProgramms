package com.sathya.Springex.Assignment1;

public class pharmacy {
	private String name;
	private String location;
	public pharmacy(String name, String location) {
		super();
		this.name = name;
		this.location = location;
	}

	public void pharinfo() {
		System.out. println("name of the pharmacy "+name);
		System.out. println("location of the pharmacy "+location);
	}
}
