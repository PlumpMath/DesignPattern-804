package com.justwin.dp.builder;

public class ConcreteBuilder implements Builder {

	public void buildPartA() {
		System.out.println("Now build part A");
	}

	public void buildPartB() {
		System.out.println("Now build part B");
	}

	public void buildPartC() {
		System.out.println("Now build part C");
	}

}
