
package com.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class SetExamples {

	public static void main(String[] args) {
		HashSet<String> item=new HashSet<>();
		item.add("chocholet");
		item.add("lays");
		item.add("bisckets");
		item.add("snacks");
		item.add("cream biscket");
		item.add("snickers");
		item.add("cooldrinks");
		item.add("polo");
		System.out.println("the stored items are.."+item);
		System.out.println("the item polo contain.."+item.contains("polo"));
		System.out.println("the item polo contain.."+item.clone());
		System.out.println();
		System.out.println();
		System.out.println();
		
		TreeSet<String> items=new TreeSet<>();
		items.add("chocholet");
		items.add("lays");
		items.add("bisckets");
		items.add("snacks");
		items.add("cream biscket");
		items.add("snickers");
		items.add("cooldrinks");
		System.out.println("the stored items are.."+items);
		System.out.println("the least items are.."+items.ceiling("lays"));//if element present show that is least element//else its show another least elemen
		System.out.println("the stored items are.."+items.floor("chocholet"));
		System.out.println("the first item is removed.."+items.pollFirst());
		System.out.println("the last items are removed.."+items.pollLast()); 
		System.out.println("it remove after the headset value ."+items.headSet("lays"));
		System.out.println("the it element least then ."+items.higher("bicket"));//it return highest element less then given element
		System.out.println("the highest item are.."+items.lower("lays"));//it return highest element greater then given element
		System.out.println("the stored items are.."+items);
		System.out.println("the stored items are.."+items.headSet("lays"));//it will terminate after given element
		System.out.println(".a Spliterator over the elements in this set."+items.spliterator());//a Spliterator over the elements in this set
		System.out.println("the stored items no are.."+items.size());//the number of elements in this set (its cardinality)
		System.out.println("the stored items are.."+items.add("barbon"));
		System.out.println("the stored items are.."+items);
		System.out.println("the stored items are.."+items.isEmpty());//returns the set is empty or not
		
		for(String x:items)
		{
			System.out.println(x);
		}
		System.out.println("------------useing itarator---------");
		Iterator<String> i=items.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	
		
	}

}

