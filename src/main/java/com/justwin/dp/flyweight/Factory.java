package com.justwin.dp.flyweight;

import java.util.HashMap;
import java.util.Map;

public class Factory {
	
	private Map<String, Shape> shapes;

	public Factory() {
		shapes = new HashMap<String, Shape>();
	}
	
	public synchronized Shape getShape(String color) {
		Shape shape = shapes.get(color);
		if (shape != null) {
			return shape;
		} else {
			shape = new Circle(color);
			shapes.put(color, shape);
		}
		return shape;
	}

	public int getShapeSum() {
		return shapes.size();
	}
}
