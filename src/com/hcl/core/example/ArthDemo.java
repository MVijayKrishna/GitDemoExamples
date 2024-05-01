package com.hcl.core.example;

public class ArthDemo {
	int getAge() {
		System.out.println("vijay inside getAGe");
		return 4;
	}

	public static void main(String[] args) {
		ArthDemo arthDemo = new ArthDemo();
		System.out.println(arthDemo.getAge());

	}

}
