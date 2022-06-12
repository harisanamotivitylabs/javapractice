package com.rail;

import java.util.Random;

abstract class Compartment
{
	public abstract String notice();
	
}
 class FirstClass extends Compartment
{
	 public String notice()
	 {
		 return "First";
	 }
}
class  Ladies extends Compartment
{
	public String notice()
	 {
		 return "Ladies";
	 }
	
}
class General extends Compartment
{
	public String notice()
	 {
		 return "General";
	 }
	
}
class Luggage extends Compartment
{
	public String notice()
	 {
		 return "Luggage";
	 }
}

public class TestCompartment {

	public static void main(String[] args) {
		Compartment c[]=new Compartment[10];
		Random random=new Random();
		for(int i=0;i<10;++i)
		{
		int rd = random.nextInt((4-1)+1)+1;
		int coach=(int)rd;
		if(coach==1)
		{
			c[i]=new FirstClass();
			System.out.println("your in  "+c[i].notice()+"  class");
		}
		else if(coach==2)
		{
			c[i]=new Ladies();
			System.out.println("your in  "+c[i].notice()+"  class");
		}
		else if(coach==3)
		{
			c[i]=new General();
			System.out.println("your in  "+c[i].notice()+"  class");
		}
		else if(coach==4)
		{
			c[i]=new Luggage();
			System.out.println("your in  "+c[i].notice()+"  class");
		}
		else 
		{
			System.out.println("invalid");
		}

	}

}
}
