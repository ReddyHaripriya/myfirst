package com.java8.features;

public class Car {
private String type;
private int year;
private String color;
public Car(String type,int year,String color){
	this.type=type;
	this.year=year;
	this.color=color;
}

public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}

@Override
public String toString() {
	return "Car [type=" + type + ", year=" + year + ", color=" + color + "]";
}


}
