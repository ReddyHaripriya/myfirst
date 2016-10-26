package com.collections.comparable.comparator;

public class Order implements Comparable<Order>{
private int productId;
private String productName;
private int price;

public Order(int id, String name, int price) {
	// TODO Auto-generated constructor stub
	this.productId=id;
	this.productName=name;
	this.price=price;
}
public int getProductId() {
	return productId;
}
public void setProductId(int productId) {
	this.productId = productId;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}

@Override
public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("Order [productId=");
	builder.append(productId);
	builder.append(", productName=");
	builder.append(productName);
	builder.append(", price=");
	builder.append(price);
	builder.append("]");
	return builder.toString();
}
@Override
public int compareTo(Order order) {
	
	return (this.getProductId()-order.getProductId());
}

}
