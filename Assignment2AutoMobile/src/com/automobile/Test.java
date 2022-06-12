package com.automobile;
import java.util.Scanner;
import com.twowheeler.Hero;
import com.twowheeler.Honda;
public class Test {

	public static void main(String[] args) {
		Vehicle vehicle;
		Scanner sc=new Scanner(System.in);
		System.out.println("which type Vehicle model want see...1. HERO OR 2.HONDA");
		int ch=sc.nextInt();
		if(ch==1)
		{
		vehicle=new Honda("Honda","AP39FA7363","hari");
		
		System.out.println("Vehicle Model Nmae  "+vehicle.getModelName());
		System.out.println("Vehicle Register Number  "+vehicle.getRegistrationNumber());
		System.out.println("Vehicle Owner Name "+vehicle.getownerName());
		System.out.println("Vehicla Speed  "+Honda.getSpeed(90));
		Honda.cdplayer("on");
		}
		if(ch==2)
		{
		vehicle=new Honda("Hero","AP39FA9869","bhaskar");
		System.out.println("Vehicle Model Nmae  "+vehicle.getModelName());
		System.out.println("Vehicle Register Number  "+vehicle.getRegistrationNumber());
		System.out.println("Vehicle Owner Name "+vehicle.getownerName());
		Hero.radio("on");
		System.out.println("Vehicla Speed  "+Hero.getSpeed(80));
		}
		
	}

}
