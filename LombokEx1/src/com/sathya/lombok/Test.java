package com.sathya.lombok;

public class Test {

	public static void main(String[] args) {
		
		Employee employee=new Employee(111,"ratan",10000.50);
		System.out.println(employee);
		
		Employee employee2=new Employee();
		employee2.setEmpId(1001);
		employee2.setEmpName("vamsi");
		employee2.setEmpSalary(10000.45);
		System.out.println(employee2.getEmpId()+" "+employee2.getEmpName()+" "+employee2.getEmpSalary());

	}

}
