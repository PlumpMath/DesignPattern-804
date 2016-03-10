package com.justwin.dp.prototype;

public class Resume implements Cloneable {

	private String name;
	private int age;
	
	public Resume(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public void display() {
		System.out.println("Name: " + name + ", Age: " + age );
	}
}
