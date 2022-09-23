package com.inheritence.example;

class WhareHouse1
{
	static int itemid;
    static String itemName;

	void itemsDetails()
	{
		System.out.println("in parent WhareHouse");
		System.out.println(itemid+" with name is"+itemName);
	}
}
class Flipkart1 extends WhareHouse1
{
	void itemDetails()
	{
		System.out.println("in child warehouse");
		System.out.println(super.itemid+" with name is  "+super.itemName);
	}
}
class Delivery extends WhareHouse1
{
	void itemDetails()
	{
		System.out.println("in sub child warehouse");
		System.out.println(super.itemid+" with name is  "+super.itemName);
	}
}

public class MultiLevelInheritence {

	public static void main(String[] args) {

		WhareHouse1 whareHouse=new WhareHouse1();
		
		whareHouse.itemid=101;
		whareHouse.itemName=" AC";
		whareHouse.itemsDetails();
		
		Flipkart1 flip=new Flipkart1();
		flip.itemDetails();
		Delivery delivery=new Delivery();
		delivery.itemDetails();

	}

}
