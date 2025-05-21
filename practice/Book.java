package com.constructor.practice;

public class Book {
	public String bookTitle;
	public String bookAuthor;
	public Book(String title, String author) {
		bookTitle=title;
		bookAuthor=author;
	}
	public void display() {
		System.out.println("Book Title: "+bookTitle);
		System.out.println("Book Author: "+bookAuthor);
	}
	public static void main(String[] args) {
		Book book=new Book("1984","George Orwell");
		book.display();
	}
}
