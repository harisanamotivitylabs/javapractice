package com.collection;

import java.util.Iterator;
import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		Stack<Integer> stk=new Stack<Integer>();
		stk.add(10);
		stk.add(20);
		stk.add(30);
		stk.add(40);
		stk.add(50);
		stk.add(60);
		stk.add(10);
		stk.add(80);
		System.out.println(stk);
		System.out.println("stack allows duplicates  "+stk);
		stk.push(70);//element add at last
		System.out.println(stk);
		System.out.println(stk.pop());//remove last element
		System.out.println(stk.capacity());// return initial capacity of list
		System.out.println(stk);
		System.out.println(stk.peek());//it will give last element of the stack
		stk.setSize(20);//to add size of stak
		System.out.println(stk.capacity());
		System.out.println(stk.set(6, 70));
		for(Integer x:stk)
		{
			System.out.println(x);
		}
		System.out.println("------------useing itarator---------");
		Iterator<Integer> i=stk.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}

}
