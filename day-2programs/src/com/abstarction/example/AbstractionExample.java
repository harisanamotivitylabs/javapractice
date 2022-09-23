package com.abstarction.example;

abstract class Mobile{
	
	abstract void camera(int pixcels);
	void calling()
	{
		System.out.println("mobile calling");
	}
}
 class Nokia{
	void camera(int pixcels)
	{
		System.out.println("this moble supported "+pixcels+" camera");
	}
	void calling()
	{
		System.out.println("calling with Nokia");
	}
}

public class AbstractionExample {

	public static void main(String[] args) {
		
		Nokia nokia=new Nokia();
		nokia.calling();
		nokia.camera(104);
		
	}

}
