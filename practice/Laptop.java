package com.constructor.practice;
import java.util.*;
public class Laptop {
	public String brand;
	public int ramSize;
	public Laptop(String br,int ram) {
		brand=br;
		ramSize=ram;
	}
	public void showSpecs() {
		System.out.println("Laptop Brand:"+brand);
		System.out.println("Laptop RAM size"+ramSize);
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Laptop Brand:");
		String brand=sc.nextLine();
		System.out.println("Enter RAM size:");
		int ramSize=sc.nextInt();
		Laptop lap1=new Laptop("Dell",16);
		lap1.showSpecs();
		Laptop lap2=new Laptop(brand,ramSize);
		lap2.showSpecs();
		
	}
}
