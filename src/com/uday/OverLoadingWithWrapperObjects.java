package com.uday;

public class OverLoadingWithWrapperObjects {
	public static void main(String[] args) {
		System.out.println("Hello");
		OverLoadingWithWrapperObjects d=new OverLoadingWithWrapperObjects();
		add(null);  //you will get compiler error because both String and Integer are same level category
		Integer x=null;
		add(x);// you will not get any error since null is the value of Integer x
	}
	
	public static void add(String a) {
		System.out.println("This is an wrapper Object"); 
	}
	public static void add(Integer a) {
		System.out.println("This is an wrapper Object"); 
	}
	
	public static void add(Object a) {
		System.out.println("This is Object class");
	}
}
