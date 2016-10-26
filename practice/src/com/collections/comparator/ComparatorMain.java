package com.collections.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorMain {

	public static void main(String[] args) {
		Order first=new Order(3,"iphone7",1000);
		Order second=new Order(1,"iphone6S",650);
		Order third=new Order(2,"iphone6",600);
		List<Order> orderList=new ArrayList<Order>();
		orderList.add(first);
		orderList.add(second);
		orderList.add(third);
		
		System.out.println("beforesort:"+orderList.toString());
		
		Collections.sort (orderList,new Comparator<Order>(){

			@Override
			public int compare(Order o1, Order o2) {
				
				return (o1.getProductId()-o2.getProductId());
			}
			
		});
		System.out.println("After Sorting:"+orderList);

	}

}
