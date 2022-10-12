package com.Bridgelabz;

public class StaticVarMethod {
	static int a=20;
	public static void method1() {
		System.out.println(a);
		
	}
	static {
		System.out.println("this is static block");
	}
	public static void main(String[] args) {
		StaticVarMethod obj1=new StaticVarMethod();
		method1();
	}

}
