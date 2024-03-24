package com.sathya.lombok;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee=new Employee();
		employee.setEmpId(1001);
		employee.setEmpName(null);
		employee.setEmpSalary(10000.45);
		System.out.println(employee.getEmpId()+" "+employee.getEmpName()+" "+employee.getEmpSalary());
		

	}

}
