package com.sathya.lombok;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString

public class Employee {
	private int empId;
	private String empName;
	private double empSalary;


}
