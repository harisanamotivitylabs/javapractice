package com.library;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your age ");
		int age=sc.nextInt();
		if(age<12)
		{
		Kidusers kuser =new  Kidusers(age,"kids");
		kuser.registerAccount();
		kuser.requestBook();
		}
		if(age>=12)
		{
		AdultUser auser=new  AdultUser(age,"fiction");
		auser.registerAccount();
		auser.requestBook();
		}
		
	}

}
