package com.javaex.ex04;

public class Point {
	//filed - capsulated by using private
	private int x ;
	private int y ;
	
	//method
	public void setterX(int a) {
		x = a;
	}
	public int getterName() {
		return x;
	}
	
	
	public void setterY(int b) {
		y = b;
	}
	public int getterY() {
		return y;
	}
	
	public void draw() {
		System.out.println("점[ x= " +  x + ", y="+ y+"]을 그렸습니다");

	}
}
