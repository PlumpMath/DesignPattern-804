package com.justwin.dp.proxy;

public class RealSubject implements Subject {
	
	private String name;
	
	public RealSubject(String name) {
		this.name = name;
	}

	public void execute(String thing) {
		System.out.println(name + " " + thing);
	}

}
