package com.justwin.dp.flyweight.learn;

/**
 * 
 * @author justwin
 * @date 2016年3月21日
 * @version 1.0
 * @description Flyweight.<br>
 * 	  1、享元模式可以极大地减少系统中对象的数量。但是它可能会引起系统的逻辑更加复杂化。<br>
 *    2、享元模式的核心在于享元工厂，它主要用来确保合理地共享享元对象。<br>
 *    3、内部状态为不变共享部分，存储于享元享元对象内部，而外部状态是可变部分，它应当油客户端来负责。<br>
 */
public class Main {

	public static void main(String[] args) {
		Factory factory = new Factory();
		Shape shape1 = factory.getShape("green");
		shape1.draw();
	
		Shape shape2 = factory.getShape("red");
		shape2.draw();
		
		Shape shape3 = factory.getShape("green");
		shape3.draw();
		
		System.out.println("Shapes size: " + factory.getShapeSum());
		System.out.println("shape1 == shape3 ? " + (shape1 == shape3));
		
	}
}
