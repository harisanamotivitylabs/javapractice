package com.Class.example;

class Employee{
	
    int id;
    String name;
    static String company;
    
    void getDetails()
    {
    	System.out.println("id is "+id);
    	System.out.println("employee name is "+name);
    	System.out.println("company "+company);
    }
    
    
}

public class Company {

	public static void main(String[] args) {
		
		Employee emp=new Employee();
		emp.id=101;
		emp.name="hari";
		Employee.company="motivity";
		emp.getDetails();

	}

}
