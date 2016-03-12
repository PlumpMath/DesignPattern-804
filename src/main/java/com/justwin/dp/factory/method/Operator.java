package com.justwin.dp.factory.method;

public abstract class Operator {

	protected long num1 = 0;
	protected long num2 = 0;
	
	public abstract long operation();

	public void setNum1(long num1) {
		this.num1 = num1;
	}

	public void setNum2(long num2) {
		this.num2 = num2;
	}
	
}
