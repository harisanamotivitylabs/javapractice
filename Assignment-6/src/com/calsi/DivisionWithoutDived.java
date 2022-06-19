package com.calsi;

import java.util.Scanner;

public class DivisionWithoutDived {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter dividend");
		int dividend=sc.nextInt();
		System.out.println("enter divisor");
		 int divisor=sc.nextInt();
		 int sign=0;
		 int count=0;
		 if(divisor<0){
	            
	            sign++;
	            divisor=divisor*-1;   
	        }
		    if(dividend<0){
	           
		    	 sign++;
		    	 dividend=dividend*-1;
	        }

		    while(dividend>=divisor)
		    {
		    	dividend=dividend-divisor;
		    	count++;
		    }
		   if(sign==1)
		    System.out.println("quotient "+-count);
		   else
			   System.out.println("quotient "+count);
	   }

	}
