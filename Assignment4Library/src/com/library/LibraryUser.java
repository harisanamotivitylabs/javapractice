package com.library;
public interface LibraryUser {
	void registerAccount();
	void requestBook();
}

class Kidusers implements LibraryUser{
	int age;
	String bookType;
	public Kidusers(int age,String bookType)
	{
		this.age=age;
		this.bookType=bookType;
	}
	public void registerAccount()
	{
		if( age < 12)
		{
			System.out.println("You have successfully registered under a Kids Account");
		}
		else
		{
			System.out.println("Your not elegible under a Kids Account catagory");
		}
			
	}
	public void requestBook()
	{
		if(age<12 && bookType.equals("kids"))
			{
			System.out.println(bookType+"  book issued successfully ...");
			System.out.println("  please return within 10 days  ...");
			}
		else if(bookType.equals("fiction"))
		{
			System.out.println(bookType+" your not elegible to  issue this book..");	
		}
	}
}
class AdultUser implements LibraryUser{
	int age;
	String bookType;
	 public AdultUser (int age,String bookType)
	{
		this.age=age;
		this.bookType=bookType;
	}
	public void registerAccount()
	{
		if( age >= 12)
		{
			System.out.println("You have successfully registered under a Fiction Account");
		}
		else
		{
			System.out.println("Your not elegible under a Adult Account catagory");
		}	
    }
	public void requestBook()
	{
	if(age>=12 && bookType.equals("fiction"))
	{
	 System.out.println(bookType+"  book issued successfully ...");
	 System.out.println("  please return within 7 days  ...");
	}
	
     else if(bookType.equals("kids"))
     {
	   System.out.println(bookType+"  your not elegible to  issue this book..this only for children");
	
     }
	}
}


















