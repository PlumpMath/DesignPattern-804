package com.justwin.dp.flyweight.instance;

public class Position {

	private int x;
	private int y;

	public Position(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "x: " + x + "px, y: " + y + "px";
	}
}
