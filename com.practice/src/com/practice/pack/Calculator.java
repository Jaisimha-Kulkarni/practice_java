package com.practice.pack;

public class Calculator {

	public static void main(String[] args) {

		double a = 10.5;
		double b = 20.5;

		System.out.println("Addition is " + Calculator.addtion(a, b) +"\n"+ "Subtraction is " + Calculator.substraction(a, b)+"\n"+
			"multiplication is " + Calculator.mulitplication(a, b) +"\n"+ "divsion is " + Calculator.division(a, b));

	}

	public static double addtion(double a, double b) {
		double sum;

		sum = a + b;

		return sum;
	}

	public static double substraction(double a, double b) {
		double sub;

		sub = a - b;

		return sub;
	}

	public static double division(double a, double b) {
		double div;

		div = a / b;

		return div;
	}

	public static double mulitplication(double a, double b) {
		double mul;

		mul = a * b;
		return mul;

	}

}
