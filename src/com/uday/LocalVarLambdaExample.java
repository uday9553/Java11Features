package com.uday;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LocalVarLambdaExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList("uday", "sagar","uday", "sagar");
		String result = list.stream()
		  .map((var x) -> x.toUpperCase()) //we can use annotations @Nonnull var x
		  .collect(Collectors.joining(", "));
		System.out.println(result);
	}

}
