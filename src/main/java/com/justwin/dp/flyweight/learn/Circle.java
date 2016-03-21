package com.justwin.dp.flyweight.learn;

public class Circle extends Shape {

	private String color;
	
	public Circle(String color) {
		this.color = color;
	}

	@Override
	public void draw() {
		System.out.println(String.format("Draw a %s circle", color));
	}
	
}
