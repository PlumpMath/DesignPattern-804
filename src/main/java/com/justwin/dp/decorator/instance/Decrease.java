package com.justwin.dp.decorator.instance;

public class Decrease implements Calculator {

	public long calculate(long num1, long num2) {
		return num1 - num2;
	}

}
