package com.practice.pack;

public class stringexample {

	public static void main(String[] args) {

		String name = " SHREE LAKSHIMI B TIGADIF VFVGFV GV ";
		int len = name.length();
		String sub = name.substring(5, 13);
		String sub2 = name.substring(13);
		String sub3 = name.trim();
		String sub4 = name.toLowerCase();
		String sub5 = name.replace(" ", "");
		String sub6 = name.replaceAll("LAKSHIMI", "laxmi");

		System.out.println(sub6);
	}
}
