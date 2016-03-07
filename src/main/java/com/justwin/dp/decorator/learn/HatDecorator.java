package com.justwin.dp.decorator.learn;


public class HatDecorator extends Decorator {

	public HatDecorator() {

	}

	@Override
	public void operation() {
		super.operation();
		System.out.println("Put hat!");
	}
}
