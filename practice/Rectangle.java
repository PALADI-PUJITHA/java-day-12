package com.constructor.practice;

public class Rectangle {
	public int length;
	public int breadth;
	public Rectangle(int len,int br) {
		length=len;
		breadth=br;
	}
	public Rectangle() {
		length=0;
		breadth=0;
		
	}
	public int getArea() {
		int area=length*breadth;
		return area;
	}
	public static void main(String args[]) {
		Rectangle rect=new Rectangle(10,8);
		int result=rect.getArea();
		System.out.println(result);
		Rectangle rect1=new Rectangle(0,0);
		int res=rect1.getArea();
		System.out.println(res);
	}
}
