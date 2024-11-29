package com.collections.customobject;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class Book implements Comparable<Book>{
	
	String title;
	double price;
	
	//Create constructor for update values on objects 
	public Book(String title, double price) {
		super();
		this.title = title;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", price=" + price + "]";
	}

	
	  @Override public int compareTo(Book o) {
	  
	  return Double.compare(this.price, o.price); }
	 

}

public class SortingExamples {

	public static void main(String[] args) {
		
		
		List<Book> book = new ArrayList<Book>();
		book.add(new Book("Wings of fire", 199.99));
		book.add(new Book("Core Java", 599.12));
		book.add(new Book("Python Advance", 492.89));
		book.add(new Book("Become a chef", 101.08));
		
		//Sort the list of book by price
		Collections.sort(book);
		
		for (Book book2 : book) {
			
			System.out.println(book2);
		}

	}

}
