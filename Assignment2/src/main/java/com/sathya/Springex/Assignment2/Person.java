package com.sathya.Springex.Assignment2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class Person {
	
	//top of the fields
	
	
	/*  @Autowired
	private HomeLoanService homeLoanService ;
	
	@Autowired
	 private RealStateService realStateService;  */
	
	//top of the setters
	
	
/*	private HomeLoanService homeLoanService ;
	private RealStateService realStateService;
	
	
	
	public HomeLoanService getHomeLoanService() {
		return homeLoanService;
	}


    @Autowired
	public void setHomeLoanService(HomeLoanService homeLoanService) {
		this.homeLoanService = homeLoanService;
	}



	public RealStateService getRealStateService() {
		return realStateService;
	}


    @Autowired
	public void setRealStateService(RealStateService realStateService) {
		this.realStateService = realStateService;
	}  */
	
	//top of the constructor
	
	private HomeLoanService homeLoanService ;
	private RealStateService realStateService;
	
	@Autowired
	public Person(HomeLoanService homeLoanService, RealStateService realStateService) {
		super();
		this.homeLoanService = homeLoanService;
		this.realStateService = realStateService;
	}
    public void details()
	{
		homeLoanService.LoanInfo();
		realStateService.realstateInfo();
	}
	 


}
