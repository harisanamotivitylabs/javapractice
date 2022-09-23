package com.rotatelist;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Rotatelist {

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			
		   LinkedList<Integer> list = new LinkedList<Integer>();
		   
			   System.out.println("enter integer list size ?");
			   int size=sc.nextInt();
			   System.out.println("enter list values");
			 for(int i=1;i<=size;++i) 
			 {
				 int n=sc.nextInt();
				 list.add(n);
		     }
		 	
		    	 System.out.println("list elementas "+list);
		 
		  
		   System.out.println("plese enter postion to rotate the list ..");
		   int k=sc.nextInt();
		   Rotatelist c= new Rotatelist() ;
		   c.rotateList(list,k);
	}
		 public void rotateList(LinkedList<Integer>list,int k)
		 {
			 while(k!=0)
			 {
				 list.addFirst(list.removeLast());
				 k--;
			 }
			 System.out.println(list);
		 }

}
