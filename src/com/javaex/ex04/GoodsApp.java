package com.javaex.ex04;

public class GoodsApp {
	public static void main(String[] args) {
		Goods computer = new Goods();
		/*
		computer.name = "LG Gram";
		computer.price = 1000000;
		*/
		computer.setName("LG Gram");
		computer.setPrice(9000000);
		
		
		Goods cup = new Goods();
		cup.setName("Mugcup");
		cup.setPrice(2000);
		
		
		Goods camera = new Goods();
		camera.setName("Nikkon");
		camera.setPrice(400000);
		
		//출력
		
//		System.out.println("상품이름: " +camera.getName());
//		System.out.println("가격: " + camera.getPrice());
//		System.out.println("");
//		System.out.println("상품이름: " +computer.getName());
//		System.out.println("가격: " + computer.getPrice());
//		System.out.println("");
//		System.out.println("상품이름: " +cup.getName());
//		System.out.println("가격: " + cup.getPrice());
		
		computer.showInfo();
		cup.showInfo();
		camera.showInfo();
		
	}
}
