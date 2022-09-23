package com.inheritence.example;

class WhareHouse2
{
	static int itemid;
    static String itemName;

	void itemsDetails()
	{
		System.out.println("in parent WhareHouse");
		System.out.println(itemid+" with name is"+itemName);
	}
}
class Flipkart2 extends WhareHouse2
{
	void itemDetails()
	{
		System.out.println("in child warehouse");
		System.out.println(super.itemid+" with name is  "+super.itemName);
	}
}
class Amazon extends WhareHouse2
{
	void itemDetails()
	{
		System.out.println("in sub child warehouse");
		System.out.println(super.itemid+" with name is  "+super.itemName);
	}
}

public class HirarchicaInheritenceExample {

	public static void main(String[] args) {
		
    WhareHouse2 whareHouse=new WhareHouse2();
		
		whareHouse.itemid=101;
		whareHouse.itemName=" AC";
		whareHouse.itemsDetails();
		
		Flipkart2 flip=new Flipkart2();
		flip.itemDetails();
		Amazon amazon=new Amazon();
		amazon.itemDetails();
		
	}

}
