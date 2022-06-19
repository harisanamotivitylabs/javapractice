package com.collection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DuplicateList {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		//Scanner sc=new Scanner(System.in);
		list.add(1);
		list.add(1);
		list.add(2);
		list.add(2);
		list.add(3);
		list.add(3);
		list.add(4);
		list.add(4);
		System.out.println("sorted list "+list);
		for(int i=0;i<list.size();++i)
		{
			for(int j=i+1;j<list.size();++j)
			{
			if(list.get(i)==list.get(j))
			{
				list.remove(j);
			}
			}
		}
		System.out.println(list);
	}

}
