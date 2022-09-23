package com.rail;

import java.util.Random;
import java.util.Scanner;

public class SalesPersion {
	public static void main(String[] args) {
	int item[]=new int[6];
	item[0]=1;
	item[1]=1;
	item[2]=2;
	item[3]=2;
	item[4]=3;
	item[5]=1;
	Random ram=new Random();
	for(int i=1;i<6;++i)
	{
	  int rd = ram.nextInt((3-1)+1)+1;
	 ram.nextInt(i);
	 item[i]=rd;
	 
	 System.out.print(item[i]+" ");
	 
    }
}
}