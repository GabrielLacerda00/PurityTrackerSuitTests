package org.example;


public class Calculator {
	
	public static int add(int a, int b) {
		return a + b;
	}
	
	public int subtract(int a, int b) {
		return add(a,b)-b;
	}
	
	public int multiply(int a, int b) {
		return a * b;
	}
	
	public float division(int a, int b) {
		return ((add(a,b)) / b);
	}

	public static void main (String args[]) {
		add(5,7);
	}
}
