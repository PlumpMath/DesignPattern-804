package com.justwin.dp.decorator.learn;


public class TShirtDecorator extends Decorator {

	@Override
	public void operation() {
		super.operation();
		System.out.println("Dress tshirt!");
	}
}
