package com.uday;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class NotPredicateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList("uday", "\n \n", "sagar", " ","chitti");
		List listwithnoblanks = list.stream()
		  .filter(Predicate.not(String::isBlank))
		  .collect(Collectors.toList());
		listwithnoblanks.forEach(res-> System.out.println(res));

	}

}
