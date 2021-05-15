package com.uday;

public class LocalVariableExample {

	public static void main(String[] args) {
		var x = "20";
		var y = 20;
		var z = 20L;
		var z1 = 'c';
		var z2 = 20.00;
		System.out.println(x);
		CheckType.typeof(y);
		CheckType.typeof(z);
		CheckType.typeof(z1);
		CheckType.typeof(z2);
	}
}

class CheckType {
	static Object typeof(Integer a) {
		System.out.println("This is Integer Type");
		return a.getClass();
	}

	static Object typeof(Character c) {
		System.out.println("This is Character Type");
		return c.getClass();
	}

	static Object typeof(Float f) {
		System.out.println("This is Float Type");
		return f.getClass();
	}

	static Object typeof(Double d) {
		System.out.println("This is Double Type");
		return d.getClass();
	}

	static Object typeof(Long l) {
		System.out.println("This is Long Type");
		return l.getClass();
	}

	static Object typeof(String s) {
		System.out.println("This is String Type");
		return s.getClass();
	}
}
