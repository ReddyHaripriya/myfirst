package com.collections.comparable.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableMain {

	public static void main(String[] args) {
		Order first=new Order(3,"iphone7",1000);
		Order second=new Order(1,"iphone6S",650);
		Order third=new Order(2,"iphone6",600);
		List<Order> orderList=new ArrayList<Order>();
		orderList.add(first);
		orderList.add(second);
		orderList.add(third);
		
		System.out.println("beforesort:"+orderList.toString());
		
		Collections.sort (orderList);
		System.out.println("After Sorting:"+orderList);
		
		
	}

}
