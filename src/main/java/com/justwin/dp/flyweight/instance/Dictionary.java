package com.justwin.dp.flyweight.instance;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Dictionary {

	private Map<String, Character> dic;
	private Random rand;

	public Dictionary() {
		this.dic = new HashMap<String, Character>();
		this.rand = new Random(System.currentTimeMillis());
	}
	
	public synchronized Character getCharacter(String chars) {
		Character charObj = dic.get(chars);
		if (charObj != null) {
			return charObj;
		}
		charObj = new Character(chars, Color.getRandomColor(), rand.nextInt(50) + 1);
		dic.put(chars, charObj);
		return charObj;
	}
	
	public int getDicSize() {
		return dic.size();
	}
}
