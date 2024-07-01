package com.javaex.ex03;

public class Goods {
	
	//filed - capsulated by using private
	private String name ;
	private int price ;
	
	//method
	public void setName(String n) {
		name = n;
	}
	public String getName() {
		return name;
	}
	
	
	public void setPrice(int p) {
		price = p;
	}
	public int getPrice() {
		return price;
	}
	
	public void showInfo() {
		System.out.println("상품이름: " +  name);
		System.out.println("가격: " + price);
		System.out.println("--------------------------------");
	}
	
}
