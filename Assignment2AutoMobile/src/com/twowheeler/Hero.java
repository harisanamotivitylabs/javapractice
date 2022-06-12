package com.twowheeler;
import com.automobile.*;
public class Hero extends Vehicle {
	String model;
	String rgnumber;
	String ownername;
	Hero(String model,String rgnumber,String ownername)
	{
		this.model=model;
		this.rgnumber=rgnumber;
		this.ownername=ownername;
		
	}
	
	public  String getModelName()
	{
		return model;
		
	}
	public  String getRegistrationNumber()
	{
		return rgnumber;
	}
	public  String getownerName()
	{
		return ownername;
	}
	public static int getSpeed(int speed)
	{
		return speed;
	}
	public static void radio(String operate)
	{
		System.out.println("radio facility is avaliable playing.."+operate+"..");
	}

}
