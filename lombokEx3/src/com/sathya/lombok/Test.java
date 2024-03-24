package com.sathya.lombok;

public class Test {

	public static void main(String[] args) {
		
		 Employee employee = Employee.builder()
				                     .empId(1001)
				                     .empName("vamsi")
				                     .empSalary(1000.45)
				                     .build();
		 System.out.println(employee);
				 
		

	}

}
