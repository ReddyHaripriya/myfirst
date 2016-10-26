package com.collections;

import java.util.HashMap;

public class HashMapTest {

	public static void main(String[] args) {
		HashMap<Country,String> countryCapitalMap=new HashMap<Country,String>();
		Country india1=new Country();
	india1.setName("India");
	 Country india2=new Country();
	 india2.setName("India");
	 countryCapitalMap.put(india1,"Delhi" );
	 countryCapitalMap.put(india2, "Delhi");
	 india1.equals(india2);
	 

	}

}
