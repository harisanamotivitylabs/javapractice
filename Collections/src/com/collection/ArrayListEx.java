package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) {
		List<String> al=new ArrayList<String>();
		al.add("PM");
		al.add("MP");
		al.add("CM");
		al.add("MLA");
		al.add("MLC");
		al.add("CORPORATOR");
		al.add("ZPTC");
		al.add("MPTC");
		System.out.println("EMPLOYES ARE "+al);
		al.add(1, "SPEACKER");//APPENDS/add element on particular mentioned index but not 
		//al.clear();//clear erase the data on list
		System.out.println("EMPLOYES ARE "+al);
		System.out.println(al.contains("CM"));// IT WILL return true if this list contains the specified element
		System.out.println(al.equals("CM"));
		System.out.println(al.get(1));// it will return specified index element
		System.out.println(al.indexOf("ZPTC"));//return element index
		System.out.println(al.isEmpty());//returns empty or not if not empty return false
		System.out.println(al.lastIndexOf("ZPTC"));//return element index
		System.out.println(al.remove(4));//REMOVED ELEMENT SPECIFIED INDEX
		System.out.println(al.set(0,"GAVARNOR"));//replace with the specified index
		al.add(1, "PM");
		System.out.println("EMPLOYES ARE "+al.contains("PM"));//check element present or not
		System.out.println("EMPLOYES ARE "+al.spliterator());//a Spliterator over the elements in this list
		System.out.println("EMPLOYES ARE "+al.iterator());
		System.out.println("------------useing foreach loop---------");
		for(String x:al)
		{
			System.out.println(x);
		}
		System.out.println("------------useing itarator---------");
		Iterator<String> i=al.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}

}

