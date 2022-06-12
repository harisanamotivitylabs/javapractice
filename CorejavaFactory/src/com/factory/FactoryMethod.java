package com.factory;
abstract class Flipkart1{
	abstract void login();
	abstract void cartItem();
	abstract void  billIng();
}
class LanguageSelect1{
	static {
		System.out.println("select language....english,telugu, hindi");
	}
}
class Electronics1 extends Flipkart1{
	void login()
	{
		System.out.println("------Flipkart Electorinics------");
		System.out.println("login with user and password or register for new user ");
	}
	void cartItem()
	{
		System.out.println("select mobile ,ac,tv,washingmachion,etc items and add to cart..");
	}
	void billIng()
	{
		System.out.println("select payment method ..and paybill..");
	}
}
class HomeNeeds1 extends Flipkart1{
	void login()
	{
		System.out.println("------Flipkart HomeNeeds------");
		System.out.println("login with user and password or register for new user ");
	}
	void cartItem()
	{
		System.out.println("select home applications items and add to cart..");
	}
	void billIng()
	{
		System.out.println("select payment method ..and paybill..");
	}
}
class Grocery1 extends Flipkart1{
	void login()
	{
		System.out.println("------Flipkart Grocery------");
		System.out.println("login with user and password or register for new user ");
	}
	void cartItem()
	{
		System.out.println("select Grocery vegtables or fruits items and add to cart..");
	}
	void billIng()
	{
		System.out.println("select payment method ..and paybill..");
	}
}
class Fashion1 extends Flipkart1{
	void login()
	{
		System.out.println("------Flipkart Fashion------");
		System.out.println("login with user and password or register for new user ");
	}
	void cartItem()
	{
		System.out.println("select fashion gents && ladies items and add to cart..");
	}
	void billIng()
	{
		System.out.println("select payment method ..and paybill..");
	}
}
class Shopping1{

	Flipkart1 getBuying(String shoppingtype)
	{
		if(shoppingtype.equals("Electronics1"))
		return new Electronics1();
		else if(shoppingtype.equals("Grocery1"))
				return new Grocery1();
		else if(shoppingtype.equals("Fashion1"))
				return new Fashion1();
		else if(shoppingtype.equals("HomeNeeds1"))
				return  new HomeNeeds1();
		else
			return null;
	}
}
public class FactoryMethod {

	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("com.factory.LanguageSelect");
		Shopping1 shop=new Shopping1();
		Flipkart1 flip=shop.getBuying("HomeNeeds1");		
		flip.login();
		flip.cartItem();
		flip.billIng();
	}
}
