package com.polymorphism.example;

class Mobile{
	void features()
	{
		System.out.println("in mobile default features methods ");
	}
	void features(int ram)
	{
		System.out.println("in mobile single features methods "+ram);
	}
	void features(String camera,int ram)
	{
		System.out.println("in mobile features camera "+camera+" and ram "+ram);
	}
}
public class MethodOverLoading {

	public static void main(String[] args) {
		

		Mobile samsung=new Mobile();
		samsung.features();
		samsung.features(4);
		samsung.features("108 pixls ", 8);
	}

}
