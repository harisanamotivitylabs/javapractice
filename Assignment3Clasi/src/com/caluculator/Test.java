package com.caluculator;
import java.util.Scanner;

class Caluculator{
	public static void powerInt(int num1, int num2)
	{
		System.out.println("integer power  "+Math.pow(num1, num2));
	}
	public static void powerDouble(double num1, double num2)
	{
		System.out.println("double power  "+Math.pow(num1, num2));
	}
}
public class Test{
	
 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("What type of number want to enter  1.integer or 2.double ");
	int choice= sc.nextInt();
	if(choice==1)
	{
		System.out.println("enter two  number");
		int fn=sc.nextInt();
		int ln=sc.nextInt();
		
	 Caluculator.powerInt(fn, ln);
	}
	else if(choice==2)
		{
		System.out.println("enter two number");
       double fn=sc.nextDouble();
       double ln=sc.nextDouble();
	    Caluculator.powerDouble(fn, ln);
		}
		}
}