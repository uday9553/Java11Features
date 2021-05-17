package com.uday;

import java.util.Optional;

public class StringAPIChanges {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Uday";
		System.out.println(s1.isBlank());
		
		String s2="  \n  ";
		System.out.println("checking s2 varible for blank "+s2.isBlank()); //return true
		
		String s3="aaaaa \n"+"bbbbbbb \n"+"cccccccc \n";
		System.out.println(s3.lines().count()); // returns number of lines

		String s4="  uday sagar  ";
		System.out.println(s4.strip()); //strip method remove leading and trailing white spaces
		
		System.out.println(s4.stripLeading()); //
		System.out.println(s4.stripTrailing());
		System.out.println(s4.repeat(5)); //prints string 5 times without using for loop
		
		String s5=null;
		if(Optional.ofNullable(s5).isPresent()) {
			System.out.println("value present");
		}else {
			System.out.println("value is null");
		}
	}

}
