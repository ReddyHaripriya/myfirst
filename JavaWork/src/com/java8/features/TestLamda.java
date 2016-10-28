package com.java8.features;

import java.util.ArrayList;
import java.util.List;

public class TestLamda {



	public static void main(String[] args) {
		Car car1=new Car("Hundai",2000,"black");
		Car car2=new Car("Hundai",2010,"silver");
		Car car3=new Car("Hundai",2011,"blue");
		Car car4=new Car("Audi",2016,"red");
		Car car5=new Car("Audi",2015,"silver");
		Car car6=new Car("Audi",2000,"black");
		Car car7=new Car("BMW",2001,"black");
		Car car8=new Car("BMW",2010,"red");
		Car car9=new Car("BMW",2016,"silver");
		List<Car> carlist=new ArrayList<>();
		carlist.add(car1);
		carlist.add(car2);
		carlist.add(car3);
		carlist.add(car4);
		carlist.add(car5);
		carlist.add(car6);
		carlist.add(car7);
		carlist.add(car8);
		carlist.add(car9);

		System.out.println("All Available cars are:"+carlist);
		
		System.out.println("----######### java 7 ##############------------------");
		
		List<Car> hundai=DifferentCars.filterCars(carlist, "Hundai");
		System.out.println("HundaiCars are:"+hundai);
		
		//using java 7 with interface	
		List<Car> audi=DifferentCars.filter(carlist, new FilterCars(){

			@Override
			public boolean filter(Car car) {
				if("black".equals(car.getColor())&& "Audi".equals(car.getType())){

					return true;
				}else
				return false;
			}
			
		});
		System.out.println("redcars are:"+audi);
		

		//Lambda expression using java 8
		System.out.println("----############### java 8 type-1##################------------------");
		List<Car> audicars=DifferentCars.filter(carlist,
				(Car car) ->{
					if("black".equals(car.getColor())&& "Audi".equals(car.getType())){

						return true;
					}else 
						return false;


				});
		System.out.println("redcars are:"+audicars);
		
System.out.println("----############### java 8 type-2 ##################------------------");	

		List<Car> audicars1=DifferentCars.filter(carlist,
				(car) ->{
					return "black".equals(car.getColor())&& "Audi".equals(car.getType());}
);
		System.out.println("redcars are:"+audicars1);

		
	
		System.out.println("----######### java 8 ##############------------------");
	//java8 using annonimous class
	
	List<Car> oldcars=DifferentCars.filter(carlist,(car)-> car.getYear()<2015);
	
	System.out.println("old cars are:"+oldcars);
	}	
	
}
