package com.hcl.core.example;

public class ArthDemo {
	int getAge(int no) {
		if (no >= 30) {
			return no;
		} else {
			return 0;
		}

	}

	public static void main(String[] args) {
		ArthDemo arthDemo = new ArthDemo();
		System.out.println(arthDemo.getAge(25));

	}

}
