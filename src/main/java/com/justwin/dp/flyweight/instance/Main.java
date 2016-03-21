package com.justwin.dp.flyweight.instance;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Random rand = new Random(System.currentTimeMillis());
		Dictionary dic = new Dictionary();
		
		Character a = dic.getCharacter("A");
		a.display(new Position(rand.nextInt(100), rand.nextInt(100)));
	
		Character b = dic.getCharacter("B");
		b.display(new Position(rand.nextInt(100), rand.nextInt(100)));
	
		Character na = dic.getCharacter("A");
		na.display(new Position(rand.nextInt(100), rand.nextInt(100)));
	
		System.out.println("a == na ? " + (a == na));
	}
}
