package com.uday;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class NestControlExample {

	public class NestedClass {
		public void getMessage() {
			System.out.println("Hello");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> nestedMembers = Arrays.stream(NestControlExample.NestedClass.class.getNestMembers())
				  .map(Class::getName)
				  .collect(Collectors.toSet());
		nestedMembers.forEach(res->System.out.println(res.getBytes()));
	}

}
