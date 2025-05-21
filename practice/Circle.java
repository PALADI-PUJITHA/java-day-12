package com.constructor.practice;

public class Circle {
	public double radius; 
	public Circle(double rad) {
		radius=rad;
	}
	public double getArea() {
		double pie=3.14;
		double area=pie*radius*radius;
		return area; 
	}
	public double getCircumferance() {
		double pie=3.14;
		double circum=pie*2*radius;
		return circum;
	}
	public static void main(String args[]) {
		Circle circle=new Circle(5.0);
		double result=circle.getArea();
		double res=circle.getCircumferance();
		System.out.println(result);
		System.out.println(res);
	}
}
