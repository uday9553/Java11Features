package com.uday;

import java.util.ArrayList;
import java.util.List;

public class ToArrayDemo {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("aaaaa");
		list.add("bbbb");
		String stringArray[]=list.toArray(String[]::new);
		for(String str:stringArray) {
			System.out.println(str);
		}
	}
}
