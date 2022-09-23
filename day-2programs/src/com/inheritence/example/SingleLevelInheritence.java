package com.inheritence.example;

class WhareHouse
{
	static int itemid;
    String itemName;

	void itemsDetails()
	{
		System.out.println("in parent WhareHouse");
		System.out.println(itemid+" with name is"+itemName);
	}
}
class Flipkart extends WhareHouse
{
	void itemDetails()
	{
		System.out.println("in child warehouse");
		System.out.println(super.itemid+" with name is  "+super.itemName);
	}
}

public class SingleLevelInheritence {

	public static void main(String[] args) {
		
		WhareHouse whareHouse=new WhareHouse();
		
		whareHouse.itemid=101;
		whareHouse.itemName=" AC";
		whareHouse.itemsDetails();
		
		Flipkart flip=new Flipkart();
		flip.itemDetails();
	}

}
