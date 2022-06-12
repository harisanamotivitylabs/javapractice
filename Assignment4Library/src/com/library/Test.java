package com.library;

public class Test {

	public static void main(String[] args) {
		
		
		Kidusers kuser =new  Kidusers(12,"kids");
		kuser.registerAccount();
		kuser.requestBook();
		
		
		AdultUser auser=new  AdultUser(13,"fiction");
		auser.registerAccount();
		auser.requestBook();
		
		
	}

}
