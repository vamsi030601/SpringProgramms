package com.sathya.Springex.JavaBasedConfiguration;

public class person {
	private String name;
    private String emailId;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public void personInfo() {
		System.out.println("hey "+name+  "welcome to the sathyatech");
		System.out.println("email Id..."+emailId);
	}
	

}