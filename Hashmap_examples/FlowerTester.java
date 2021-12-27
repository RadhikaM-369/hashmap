package com.xworkz.Collections.Hashmap_examples;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;

public class FlowerTester {

	public static void main(String[] args) {
		
		HashMap<Integer,String> hashMap=new HashMap<Integer,String>();
		
		hashMap.put(10, "Orchid");
		hashMap.put(8, null);
		hashMap.put(1, "Lotus");
		hashMap.put(2, "Rose");
		hashMap.put(3, "Jasmin");
		hashMap.put(4, "Lavendor");
		hashMap.put(9, "Lavendor");
		hashMap.put(5, "Saffron");
		hashMap.put(6, null);
		hashMap.put(7, "Orchid");
		hashMap.put(7, "Bargamont");
		
		Set<Entry<Integer,String>> entrySet=hashMap.entrySet();
		
		Iterator<Entry<Integer,String>> iterator=entrySet.iterator();
		
		while(iterator.hasNext()) {
			
			Entry<Integer,String> next=iterator.next();
			System.out.println("Key : "+next.getKey()+" & Value : "+next.getValue());
						
		}
		System.out.println("--------------------------------------------------------");
		
		boolean contain=hashMap.containsKey(7);
		System.out.println("Does map contains the key : "+contain);
		
		System.out.println("--------------------------------------------------------");
		
		String gget=hashMap.get(7);
		System.out.println(gget);
		
		System.out.println("--------------------------------------------------------");
		
		int sz=hashMap.size();
		System.out.println("Size is : "+sz);
		
		System.out.println("--------------------------------------------------------");
		

	}

}
