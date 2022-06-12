package com.factory;
abstract class Flipkart{
	abstract void login();
	abstract void cartItem();
	abstract void  billIng();
}

class Electronics extends Flipkart{
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
class HomeNeeds extends Flipkart{
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
class Grocery extends Flipkart{
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
class Fashion extends Flipkart{
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
class Shopping{

	static Flipkart getBuying(String shoppingtype)
	{
		if(shoppingtype.equals("Electronics"))
		return new Electronics();
		else if(shoppingtype.equals("Grocery"))
				return new Grocery();
		else if(shoppingtype.equals("Fashion"))
				return new Fashion();
		else if(shoppingtype.equals("HomeNeeds"))
				return  new HomeNeeds();
		else
			return null;
	}
}
class LanguageSelect{
	static {
		System.out.println("select language....english,telugu, hindi");
	}
}
public class StaticFactoryMethodEx {

	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("com.factory.LanguageSelect");
		Flipkart flip=Shopping.getBuying("HomeNeeds");
		flip.login();
		flip.cartItem();
		flip.billIng();
	}
}
