package com.bhaskar.in;

class Department{
	Department()
	{
		System.out.println("in department printing ");
	}
	
	String depart;
	
	static String ceo;
	
	void show() {
		System.out.println(depart);
		System.out.println(ceo);
	}
}


public class Employee {

	public static void main(String[] args) {
		Department dept=new Department();
		
		dept.depart="mech";
		Department.ceo="development";
		dept.show();
		
	

	}

  }
