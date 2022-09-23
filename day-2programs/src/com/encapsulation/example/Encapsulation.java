package com.encapsulation.example;

class Employee{
	private int id;
	private String name;
	private static String Companyname;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static String getCompanyname() {
		return Companyname;
	}
	public static void setCompanyname(String companyname) {
		Companyname = companyname;
	}
	
  void getDetails() {
	  System.out.println("id is "+id);
  	System.out.println("employee name is "+name);
  	System.out.println("company "+Companyname);
  }
	
}
public class Encapsulation {

	public static void main(String[] args) {
	Employee emp =new Employee();
	emp.setId(101);
	emp.setName("hari");
	emp.setCompanyname("motivity");
	emp.getDetails();

	}

}
