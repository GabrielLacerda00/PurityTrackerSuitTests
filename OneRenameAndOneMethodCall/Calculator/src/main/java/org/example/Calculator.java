package org.example;


public class Calculator {
	
	public static int sum(int a, int b) {
		return a + b;
	}
	
	public int subtract(int a, int b) {
		return add(a,b) - a;
	}
	
	public int multiply(int a, int b) {
		return a * b;
	}
	
	public float division(int a, int b) {
		return a / b;
	}

	public static void main (String args[]) {
		sum(5,7);
	}
}
