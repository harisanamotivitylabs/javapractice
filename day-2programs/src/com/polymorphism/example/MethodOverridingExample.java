package com.polymorphism.example;

class Mobile2{

	void features(String brand,String camera,int ram)
	{
		System.out.println(brand+" mobile features camera "+camera+" and ram "+ram);
	}
}
class Redmi extends Mobile2{
	
	void features(String brand,String camera,int ram)
	{
		System.out.println(brand+" mobile features camera "+camera+" and ram "+ram);
	}
}
public class MethodOverridingExample {

	public static void main(String[] args) {
		
		Mobile2 mobile=new Mobile2();
		mobile.features(null, null, 0);
		Redmi redmi=new Redmi();
		redmi.features("redmi", "108 pixcels", 8);
		
	}

}
