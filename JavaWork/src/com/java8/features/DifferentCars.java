package com.java8.features;

import java.util.ArrayList;
import java.util.List;



public class DifferentCars {
	//using java7 without interface
	public static List<Car> filterCars(List<Car> carList, String type) {
		List<Car> typehundai = new ArrayList<>();

		for (Car car : carList) {
			if (type.equals(car.getType())) {
				typehundai.add(car);
			}

		}

		return typehundai;
	}
	//using interface java7
	/*public static List<Car> filter(List<Car> inCarList, FilterCars filterCars) {
		List<Car> filterCarList = new ArrayList<>();

		for (Car car : inCarList) {
			if (filterCars.filter(car)) {
				filterCarList.add(car);

			}
		}













		return filterCarList;

	}*/
	
	//with interface 
	public static List<Car> filter(List<Car> inCarList, FilterCars filterCars) {
		List<Car> filterCarList = new ArrayList<>();

		for (Car car : inCarList) {
			if (filterCars.filter(car)) {
				filterCarList.add(car);

			}
		}

		return filterCarList;

	}
}
