package com.twowheeler;
import com.automobile.*;
public class Honda extends Vehicle {
	String model;
	String rgnumber;
	String ownername;
	public Honda(String model,String rgnumber,String ownername)
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
	public static void cdplayer(String operate)
	{
		System.out.println("cd player faciality avaliable "+operate+"....");
	}
}
