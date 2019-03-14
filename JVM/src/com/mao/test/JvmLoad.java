package com.mao.test;

public class JvmLoad {

	public static void main(String[] args) {
		staticFunction();
	}

	static JvmLoad st = new JvmLoad();
	int a = 110;
	static int b = 112;
	static {
		System.out.println("1");
	}
	{
		System.out.println("2");
	}

	JvmLoad() {
		System.out.println("3");
		System.out.println("a=" + a + ",b=" + b);
	}

	public static void staticFunction() {
		System.out.println("4");
	}
}