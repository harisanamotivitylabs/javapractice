package com.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(101,"chocholet");
		map.put(103,"lays");
		map.put(104,"bisckets");
		map.put(105,"snacks");
		map.put(105,"cream biscket");
		map.put(106,"snickers");
		map.put(107,"cooldrinks");
		map.put(108,"polo");
		System.out.println("list is "+map);
		
		for(Integer key: map.keySet())
		{	
			System.out.println(key+"="+map.get(key));	
		}
		System.out.println("------------itarator----------------------");
		
		Iterator<Integer> itr = map.keySet().iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next()+"="+map.get(itr.next()));
        }
	}

}
