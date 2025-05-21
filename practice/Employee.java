package com.constructor.practice;

public class Employee {
	public String name;
	public double salary;
	public Employee(String n,double sal) {
		name=n;
		salary=sal;
	}
	public void displayDetails() {
		if(salary<0) {
			salary=0;
		}
		else {
			System.out.println("name: "+name);
			System.out.println("salary: "+salary);
		}
	}
	public static void main(String args[]) {
		Employee emp=new Employee("Pujitha",40000.0);
		emp.displayDetails();
		
	}
}
