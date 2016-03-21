package com.justwin.dp.flyweight.instance;

public class Character {

	private String character;
	private Color color;
	private int size;
	
	public Character(String character, Color color, int size) {
		this.character = character;
		this.color = color;
		this.size = size;
	}
	
	public void display(Position position) {
		System.out.println(String.format("Characrer %s(size: %d, color: %s) display on %s", character, size, color, position));
	}
}
