package com.justwin.dp.flyweight.instance;

import java.util.Random;

public enum Color {

	GREEN,
	RED,
	BLACK,
	BLUE,
	WHITE;
	
	public static Color getRandomColor() {
		Color[] colors = Color.values();
		return colors[new Random().nextInt(colors.length)];
	}
	
}
